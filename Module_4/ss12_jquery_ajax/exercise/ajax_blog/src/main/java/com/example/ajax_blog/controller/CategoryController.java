package com.example.ajax_blog.controller;

import com.example.ajax_blog.service.IBlogService;
import com.example.ajax_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IBlogService iBlogService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("categories", iCategoryService.findAll());
        return "category/list";
    }

    @GetMapping("category/list")
    public String showList(Model model) {
        model.addAttribute("categories", iCategoryService.findAll());
        return "category/list";
    }

    @GetMapping("/category/detail/{idBlog}")
    public String detail(Model model, @PathVariable("idBlog") int idBlog) {
        model.addAttribute("blog", iBlogService.findAllByCategory_IdBlog(idBlog));
        return "/blog/list";
    }
}
