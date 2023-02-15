package com.example.test_project.controller;

import com.example.test_project.dto.ValidateStudent;
import com.example.test_project.model.Student;
import com.example.test_project.service.IClassService;
import com.example.test_project.service.IStudentService;
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
@RequestMapping("student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @Autowired
    ValidateStudent validateStudent;

    @Autowired
    IClassService iClassService;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("students", iStudentService.findAll(PageRequest.of(page, 2)));
        return "student/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("classes", iClassService.findAll());
        return "student/create";
    }

    @PostMapping("/save")
    public String create( @ModelAttribute("student") Student student, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        validateStudent.validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("classes", iClassService.findAll());
            return "student/create";
        }
        iStudentService.createOrrUpdate(student);
        redirectAttributes.addFlashAttribute("message", "them moi Thanh Cong ");
        return "redirect:/student/list";
    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable("id") Long id, Model model) {
        model.addAttribute("student", iStudentService.findById(id));
        model.addAttribute("classes", iClassService.findAll());
        return "student/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        validateStudent.validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("classes", iClassService.findAll());
            return "student/create";
        }
        iStudentService.createOrrUpdate(student);
        redirectAttributes.addAttribute("message", "Update thanh cong ");
        return "redirect:/student/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("idStudent") Long id) {
        iStudentService.deleteById(id);
        return "redirect:/student/list";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        ModelAndView modelAndView = new ModelAndView("student/list");
        if (name == null || name.trim().isEmpty()) {
            modelAndView.addObject("students", iStudentService.findAll(PageRequest.of(page, 2)));
            return modelAndView;
        }
        modelAndView.addObject("students", iStudentService.findByName(name, PageRequest.of(page, 10)));
        return modelAndView;
    }

}
