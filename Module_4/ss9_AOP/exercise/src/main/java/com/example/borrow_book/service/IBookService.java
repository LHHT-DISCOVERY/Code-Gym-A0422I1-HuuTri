package com.example.borrow_book.service;

import com.example.borrow_book.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);
}
