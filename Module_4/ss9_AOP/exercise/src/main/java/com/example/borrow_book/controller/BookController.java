package com.example.borrow_book.controller;

import com.example.borrow_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;


    @GetMapping("/home")
    public String showBook(Model model) {
        model.addAttribute("books", iBookService.findAll());
        return "index";
    }
}
