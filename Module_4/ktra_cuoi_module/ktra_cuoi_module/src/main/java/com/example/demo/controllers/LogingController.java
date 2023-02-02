package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LogingController {
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
    @PostMapping("/login")
    public String doLogin(Model model, @RequestParam("username") String user, @RequestParam("password") String password, HttpSession session){
        if("phamtheduyet".equals(user) && "123456".equals(password)){
            session.setAttribute("username",user);
            return "redirect:/list5";
        }
        model.addAttribute("error","Login failed. Username or password doesn't correct");
        return "login";
    }
    @GetMapping("/logout")
    public String doLogout(HttpSession session){
        session.removeAttribute("username");
        return "login";
    }
}
