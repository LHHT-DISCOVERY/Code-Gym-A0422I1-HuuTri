package com.example.restful_api_blog.controller;

import com.example.restful_api_blog.service.IBlogService;
import com.example.restful_api_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

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
        model.addAttribute("blog", iBlogService.listBlogByIdCategory(idBlog));
        return "/blog/list";
    }
}
