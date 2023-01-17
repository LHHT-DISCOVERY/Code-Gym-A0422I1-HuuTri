package com.example.test_product.controller;

import com.example.test_product.model.Product;
import com.example.test_product.service.IProductService;
import com.example.test_product.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService iProductService ;

    @Autowired
    IProductTypeService iProductTypeService ;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("productList" , iProductService.findAll());
        return "product/list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product" , new Product());
        model.addAttribute("productType" , iProductTypeService.findAll());
        return "product/create";
    }

    @PostMapping ("/create")
    public String doCreate(@ModelAttribute("product") Product product){
        iProductService.createOrUpdate(product);
        return "redirect:/product/list";
    }

}
