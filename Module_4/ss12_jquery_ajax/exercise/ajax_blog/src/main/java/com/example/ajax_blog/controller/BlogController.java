package com.example.ajax_blog.controller;

import com.example.ajax_blog.model.Blog;
import com.example.ajax_blog.service.IBlogService;
import com.example.ajax_blog.service.ICategoryService;
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
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

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
    public String create(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.createOrUpdate(blog);
        redirectAttributes.addFlashAttribute("message", "Them moi thanh cong !");
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String update(@RequestParam("content") String content,
                         @RequestParam("id") int id,
                         @RequestParam("name") String name) {
        iBlogService.update(id, name, content);
        return "blog/list";
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

    @GetMapping("/search")
    public String list(Model model, @RequestParam(value = "name", defaultValue = "") String name) {
        List<Blog> blogs = "".equals(name) ? iBlogService.findAll() : iBlogService.findByName(name);
        model.addAttribute("blog", blogs);
        return "blog/list";
    }
}
