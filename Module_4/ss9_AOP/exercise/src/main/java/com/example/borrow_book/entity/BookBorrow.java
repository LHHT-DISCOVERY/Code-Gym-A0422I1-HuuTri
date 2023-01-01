package com.example.borrow_book.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class BookBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "{notempty}")
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(columnDefinition = "date")
    private Date bookBorrow;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(columnDefinition = "date")
    private Date bookPay;
    @ManyToOne
    @JoinColumn(name = "idBook", referencedColumnName = "idBook")
    private Book book;

    public BookBorrow() {

    }

    public BookBorrow(int id, String name, Date bookBorrow, Date bookPay, Book book) {
        this.id = id;
        this.name = name;
        this.bookBorrow = bookBorrow;
        this.bookPay = bookPay;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBookBorrow() {
        return bookBorrow;
    }

    public void setBookBorrow(Date bookBorrow) {
        this.bookBorrow = bookBorrow;
    }

    public Date getBookPay() {
        return bookPay;
    }

    public void setBookPay(Date bookPay) {
        this.bookPay = bookPay;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
