package com.example.test_project.controller;

import com.example.test_project.model.Classes;
import com.example.test_project.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
    public String create(@Valid @ModelAttribute("classes") Classes classes, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "class/create";
        }
        iClassService.createOrUpdate(classes);
        redirectAttributes.addFlashAttribute("mess", "Them moi thanh cong");
        return "redirect:/class/list";
    }


    @PostMapping("/update")
    public String doUpdate(@Valid @ModelAttribute("classes") Classes classes, BindingResult
            bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "class/update";
        }
        iClassService.createOrUpdate(classes);
        redirectAttributes.addFlashAttribute("mess", "Them moi thanh cong");
        return "redirect:/class/list";

    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("classes", iClassService.findById(id));
        return "class/update";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int idStudent) {
        iClassService.deleteById(idStudent);
        return "redirect:/class/list";
    }
}
