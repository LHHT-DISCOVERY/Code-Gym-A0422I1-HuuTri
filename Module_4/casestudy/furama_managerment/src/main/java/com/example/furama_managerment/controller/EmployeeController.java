package com.example.furama_managerment.controller;

import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.service.employee_service.IDivisionService;
import com.example.furama_managerment.service.employee_service.IEducationDegreeService;
import com.example.furama_managerment.service.employee_service.IEmployeeService;
import com.example.furama_managerment.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IDivisionService iDivisionService;
    @Autowired
    IEducationDegreeService iEducationDegreeService;

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("positions", iPositionService.findALl());
        model.addAttribute("divisions", iDivisionService.findAll());
        model.addAttribute("educationDegrees", iEducationDegreeService.findAll());
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        iEmployeeService.createOrUpdate(employee);
        redirectAttributes.addFlashAttribute("message", "Them Moi Thanh Cong ");
        return "redirect:/employee/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idEmployee") int id, RedirectAttributes redirectAttributes) {
        iEmployeeService.deleteById(id);
        redirectAttributes.addFlashAttribute("messageDelete", "Xoa Thanh Cong");
        return "redirect:/employee/list";
    }

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("employees", iEmployeeService.findAllPage(PageRequest.of(page, 2)));
        return "/employee/list";
    }
}
