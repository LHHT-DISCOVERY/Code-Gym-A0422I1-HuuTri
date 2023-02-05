package com.example.furama_managerment.controller;

import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.service.employee_service.IDivisionService;
import com.example.furama_managerment.service.employee_service.IEducationDegreeService;
import com.example.furama_managerment.service.employee_service.IEmployeeService;
import com.example.furama_managerment.service.employee_service.IPositionService;
import com.example.furama_managerment.validate.EmployeeValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
    public String create(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        EmployeeValidate employeeValidate = new EmployeeValidate();
        employeeValidate.validate(employee, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("positions", iPositionService.findALl());
            model.addAttribute("divisions", iDivisionService.findAll());
            model.addAttribute("educationDegrees", iEducationDegreeService.findAll());
            return "/employee/create";
        }
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

    @GetMapping("/view/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", iEmployeeService.findById(id));
        return "/employee/view";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        ModelAndView modelAndView = new ModelAndView("employee/list");
        if (name == null || name.trim().isEmpty()) {
            modelAndView.addObject("employees", iEmployeeService.findAllPage(PageRequest.of(page, 5)));
            return modelAndView;
        }
        modelAndView.addObject("employees", iEmployeeService.findEmployeeByName(name, PageRequest.of(page, 6)));
        return modelAndView;
    }

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("employees", iEmployeeService.findAllPage(PageRequest.of(page, 5)));
        return "/employee/list";
    }
}
