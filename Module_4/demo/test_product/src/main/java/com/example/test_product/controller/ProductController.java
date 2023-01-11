package com.example.test_product.controller;

import com.example.test_product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService iProductService ;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("products" , iProductService.findAll());
        return "product/list";
    }

}
