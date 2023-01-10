package com.example.restful_api_blog.controller;

import com.example.restful_api_blog.model.Blog;
import com.example.restful_api_blog.model.Category;
import com.example.restful_api_blog.service.IBlogService;
import com.example.restful_api_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

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
    public String doCreate(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.createOrUpdate(blog);
        redirectAttributes.addFlashAttribute("message", "Them moi thanh cong ");
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") int id) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categorys",categoryList);
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog) {
        iBlogService.createOrUpdate(blog);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        iBlogService.deleteByd(id);
        return "redirect:/blog/list";
    }

}
