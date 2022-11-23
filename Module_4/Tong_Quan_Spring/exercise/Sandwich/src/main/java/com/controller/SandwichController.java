package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class SandwichController {
    @GetMapping
    public String showForm() {
        return "/sandwich/home";
    }

    @PostMapping("/result")
    public String result(Model model , @RequestParam("condiment") String[] condiment){
        String result = "";

        for (String s : condiment
             ) {
            result +=  s + " , "   ;
        }

        model.addAttribute("result" ,result);

        return "/sandwich/home";
    }
}
