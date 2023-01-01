package com.example.borrow_book.service.imp;

import com.example.borrow_book.entity.BookBorrow;
import com.example.borrow_book.repository.IBookBorrowRepository;
import com.example.borrow_book.service.IBookBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBorrowService implements IBookBorrowService {
    @Autowired
    IBookBorrowRepository iBookBorrowRepository;

    @Override
    public void create(BookBorrow bookBorrow) {
        iBookBorrowRepository.save(bookBorrow);
    }

    @Override
    public void update(BookBorrow bookBorrow) {
        iBookBorrowRepository.save(bookBorrow);
    }

    @Override
    public void delete(int id) {
        iBookBorrowRepository.deleteById(id);
    }

    @Override
    public List<BookBorrow> findAll() {
        return iBookBorrowRepository.findAll();
    }

    @Override
    public BookBorrow findById(int id) {
        return iBookBorrowRepository.findById(id).orElse(null);
    }
}
