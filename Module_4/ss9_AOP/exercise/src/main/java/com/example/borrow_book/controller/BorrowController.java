package com.example.borrow_book.controller;

import com.example.borrow_book.entity.Book;
import com.example.borrow_book.entity.BookBorrow;
import com.example.borrow_book.repository.IBookBorrowRepository;
import com.example.borrow_book.service.IBookBorrowService;
import com.example.borrow_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class BorrowController {
    @Autowired
    IBookBorrowService iBookBorrowService ;
    @Autowired
    IBookService iBookService;

    @GetMapping("/create/{id}")
    public String createBorrow(@PathVariable("id") int id , Model model){
        BookBorrow  bookBorrow = new BookBorrow();
        Book book = iBookService.findById(id);
        model.addAttribute("bookBorrow", bookBorrow);
        model.addAttribute("book" , book);
        return "create";
    }

    @PostMapping("/borrow")
    public String doCreate(@ModelAttribute("bookBorrow")BookBorrow bookBorrow , Model model){
        iBookBorrowService.create(bookBorrow);
        return "redirect:/home";
    }
    @GetMapping("/viewBorrow")
    public String viewBorrow(Model model){
        model.addAttribute("bookBorrow" , iBookBorrowService.findAll());
        return "viewBorrowBook";
    }

    @GetMapping("/deleteBorrow")
    public String deleteBorrow(@RequestParam("idDelete") int idDelete ){
        iBookBorrowService.delete(idDelete);
        return "redirect:/home";
    }
}
