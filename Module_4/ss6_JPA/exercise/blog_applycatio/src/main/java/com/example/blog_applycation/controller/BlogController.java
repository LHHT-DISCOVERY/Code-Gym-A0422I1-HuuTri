package com.example.blog_applycation.controller;

import com.example.blog_applycation.model.Blog;
import com.example.blog_applycation.model.Category;
import com.example.blog_applycation.service.IBlogService;
import com.example.blog_applycation.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService  iCategoryService ;

    @GetMapping("/list")
    public String show(Model model) {
        model.addAttribute("blog", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categorys", iCategoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog , RedirectAttributes redirectAttributes) {
        iBlogService.createOrUpdate(blog);
        redirectAttributes.addFlashAttribute("message" , "Them moi thanh cong !");
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("blog") Blog blog) {
        iBlogService.createOrUpdate(blog);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") int id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/detail";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        iBlogService.deleteById(id);
        return "redirect:/blog/list";
    }
}
