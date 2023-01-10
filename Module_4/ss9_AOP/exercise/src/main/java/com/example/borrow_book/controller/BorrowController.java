package com.example.borrow_book.controller;

import com.example.borrow_book.entity.Book;
import com.example.borrow_book.entity.BookBorrow;
import com.example.borrow_book.service.IBookBorrowService;
import com.example.borrow_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping()
public class BorrowController {
    @Autowired
    private IBookBorrowService iBookBorrowService;
    @Autowired
    private IBookService iBookService;

    @GetMapping("/create/{id}")
    public String createBorrow(@PathVariable("id") int id, Model model) {
        BookBorrow bookBorrow = new BookBorrow();
        Book book = iBookService.findById(id);
        model.addAttribute("bookBorrowObj", bookBorrow);
        model.addAttribute("book", book);
        return "create";
    }

    @PostMapping("/borrow")
    public String doCreate(@Valid @ModelAttribute("bookBorrowObj") BookBorrow bookBorrow, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("book" , iBookService.findById(bookBorrow.getBook().getIdBook()));
            return "create";
        }

        iBookBorrowService.create(bookBorrow);
        return "redirect:/home";
    }

    @GetMapping("/viewBorrow")
    public String viewBorrow(Model model) {
        model.addAttribute("bookBorrow", iBookBorrowService.findAll());
        return "viewBorrowBook";
    }

    @GetMapping("/deleteBorrow")
    public String deleteBorrow(@RequestParam("idDelete") int idDelete, Model model) {
        iBookBorrowService.delete(idDelete);
        model.addAttribute("bookBorrow", iBookBorrowService.findAll());
        return "viewBorrowBook";
    }
}
