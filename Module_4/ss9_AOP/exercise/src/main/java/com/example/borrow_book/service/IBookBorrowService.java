package com.example.borrow_book.service;

import com.example.borrow_book.entity.BookBorrow;

import java.util.List;

public interface IBookBorrowService {
    void create(BookBorrow bookBorrow);

    void update(BookBorrow bookBorrow);

    void delete(int id);

    List<BookBorrow> findAll();

    BookBorrow findById(int id);
}
