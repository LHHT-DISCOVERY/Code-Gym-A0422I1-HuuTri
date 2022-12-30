package com.controller;

import com.bean.Picture;
import com.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    IPictureService pictureService;


    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("pictures", pictureService.findAll());
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("picture", new Picture());
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("picture") Picture picture){
        pictureService.create(picture);
        return "redirect:/picture/home";
    }
}
