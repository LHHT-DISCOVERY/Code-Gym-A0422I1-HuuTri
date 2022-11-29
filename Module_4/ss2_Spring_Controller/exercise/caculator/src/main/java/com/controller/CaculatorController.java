package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class CaculatorController {

    @GetMapping
    public String Show() {
        return "/home";
    }

    @PostMapping("/result")
    public String result(Model model, @RequestParam("number1") double number1, @RequestParam("number2") double number2, @RequestParam("pt") String pt) {
        double result;
        if (pt.equals("cong")) {
            result = number1 + number2;
        } else if (pt.equals("tru")) {
            result = number1 - number2;
        } else if (pt.equals("nhan")) {
            result = number1 * number2;
        } else {
            result = number1 / number2;
        }

        model.addAttribute("result", result);

        return "home";
    }
}
