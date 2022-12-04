package com.controller;

import com.bean.Product;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping({"/list", ""})
    public String showList(Model model) {
        model.addAttribute("product", iProductService.show());
        return "list";
    }

    //    dùng được path vì thẻ a lấy id từ list (dùng path từ list)
    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") int id) {
        model.addAttribute("product", iProductService.findById(id));
        return "detail";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") int id) {
        model.addAttribute("product", iProductService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("product") Product product) {
        iProductService.createOrUpdate(product);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete( @RequestParam("id") int id) {
        iProductService.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "name" , defaultValue = "") String name , Model model){
        model.addAttribute("product" , iProductService.findByName(name));
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("product" , new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("product") Product product){
         iProductService.createOrUpdate(product);
        return "redirect:/list";
    }
}
