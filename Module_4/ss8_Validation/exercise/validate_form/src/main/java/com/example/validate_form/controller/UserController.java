package com.example.validate_form.controller;

import com.example.validate_form.model.User;
import com.example.validate_form.validate.UserValidate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class UserController {
    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("user" , new User());
        return "view/index";
    }

    @PostMapping("/signup")
    public String doSignUp(@Valid @ModelAttribute("user")User user , BindingResult bindingResult , Model model){
//        UserValidate userValidate = new UserValidate();
//        userValidate.validate(user , bindingResult);
        if(bindingResult.hasErrors()){
            return "view/index";
        }
        return "view/result";
    }
}
