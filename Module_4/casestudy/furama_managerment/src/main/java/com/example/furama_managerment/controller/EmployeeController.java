package com.example.furama_managerment.controller;

import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.repository.employee_repository.IEducationDegreeRepository;
import com.example.furama_managerment.service.employee_service.IDivisionService;
import com.example.furama_managerment.service.employee_service.IEducationDegreeService;
import com.example.furama_managerment.service.employee_service.IEmployeeService;
import com.example.furama_managerment.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IPositionService iPositionService ;
    @Autowired
    IDivisionService iDivisionService ;
    @Autowired
    IEducationDegreeService  iEducationDegreeService ;

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("positions" , iPositionService.findALl());
        model.addAttribute("divisions" , iDivisionService.findAll());
        model.addAttribute("educationDegrees" , iEducationDegreeService.findAll());
        model.addAttribute("employee" , new Employee());
        return "employee/create";
    }
    @GetMapping("/save")
    public String create(@ModelAttribute("employee") Employee employee){
        iEmployeeService.createOrUpdate(employee);
        return "redirect:/";
    }

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("employees" ,iEmployeeService.findAll());
        return "employee/list";
    }
}
