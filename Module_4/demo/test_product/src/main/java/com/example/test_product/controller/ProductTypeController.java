package com.example.test_product.controller;

import com.example.test_product.model.ProductType;
import com.example.test_product.service.IProductService;
import com.example.test_product.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;


@RequestMapping("/productType")
@Controller
public class ProductTypeController {

    @Autowired
    IProductTypeService iProductTypeService ;

    @Autowired
    IProductService iProductService ;

    @GetMapping("/list")
    public String showProductType(Model model){
        model.addAttribute("productType" ,iProductTypeService.findAll());
        return "productType/list";
    }

    @GetMapping("/detail/{idProductType}")
    public String detailProductType(@PathVariable("idProductType") int idProductType , Model  model) {
        model.addAttribute("productList" ,iProductService.findAllByIdProductType(idProductType));
        return "product/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("productType" , new ProductType());
        return "productType/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("productType") ProductType productType){
        iProductTypeService.createOrUpdate(productType);
        return "redirect:/productType/list";
    }
}
