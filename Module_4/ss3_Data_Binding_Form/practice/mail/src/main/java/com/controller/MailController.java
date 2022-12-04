package com.controller;

import com.bean.ConfigEmail;
import com.service.IConfigEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class MailController {
    @Autowired
    @Qualifier("configEmailService")
    IConfigEmailService iConfigEmailService;

    @GetMapping
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home", "configEmail", iConfigEmailService.show());
        return modelAndView;
    }

    @GetMapping("showUpdate")
    public String update(Model model) {
        model.addAttribute("emailConfig", new ConfigEmail("", 0, false, ""));
        model.addAttribute("lg", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("pg", new Integer[]{5, 10, 15, 25, 50, 100});
        return "update";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute ConfigEmail ConfigEmail) {
        model.addAttribute("configEmail", ConfigEmail);
        return "home";
    }

}
