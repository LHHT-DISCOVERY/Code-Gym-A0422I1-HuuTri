package com.example.blog_applycation.controller;

import com.example.blog_applycation.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("/list")
    public String show(Model model){
        model.addAttribute("category", iCategoryService.findAll() );
        return "category/list";
    }
}
