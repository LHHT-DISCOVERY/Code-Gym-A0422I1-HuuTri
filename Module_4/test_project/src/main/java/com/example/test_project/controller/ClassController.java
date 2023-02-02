package com.example.test_project.controller;

import com.example.test_project.model.Classes;
import com.example.test_project.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    IClassService iClassService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("classes", iClassService.findAll());
        return "class/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("classes", new Classes());
        return "class/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("classes") Classes classes, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("mess", "Them moi thanh cong");
        iClassService.createOrUpdate(classes);
        return "redirect:/class/list";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam int idStudent) {
        iClassService.deleteById(idStudent);
        return "redirect:/class/list";
    }
}
