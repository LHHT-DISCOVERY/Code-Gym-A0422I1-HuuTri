package com.example.test_project.controller;

import com.example.test_project.model.Student;
import com.example.test_project.service.IClassService;
import com.example.test_project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    IStudentService iStudentService ;

    @Autowired
    IClassService iClassService ;

    @GetMapping("/list" )
    public String showList(Model model){
        model.addAttribute("students" , iStudentService.findAll() );
        return "student/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("student" , new Student());
        model.addAttribute("classes" , iClassService.findAll());
        return "student/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("student") Student student , RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message" , "Them Moi Thanh Cong ");
        iStudentService.createOrrUpdate(student);
        return "redirect:/student/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("idStudent") Long id ){
        iStudentService.deleteById(id);
        return "redirect:/student/list";
    }

}
