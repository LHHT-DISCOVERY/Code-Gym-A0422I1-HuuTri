package com.example.blog_applycation.controller;

import com.example.blog_applycation.model.Blog;
import com.example.blog_applycation.model.Category;
import com.example.blog_applycation.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("blog", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/blog/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categorys", new Category());
        return "blog/create";
    }

    @PostMapping("/blog/create")
    public String create(@ModelAttribute("blog") Blog blog) {
        iBlogService.createOrUpdate(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/update")
    public String showUpdate(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/blog/update")
    public String update(@ModelAttribute("blog") Blog blog) {
        iBlogService.createOrUpdate(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/detail/{id}")
    public String detail(Model model, @PathVariable("id") int id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/detail";
    }


    @GetMapping("/blog/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        iBlogService.deleteById(id);
        return "redirect:/";
    }
}
