package com.example.borrow_book.repository;

import com.example.borrow_book.entity.BookBorrow;
import com.example.borrow_book.service.imp.BookBorrowService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface IBookBorrowRepository extends JpaRepository<BookBorrow, Integer> {
    //     đây là viết ra câu lệnh sql thuần'= , còn nếu ko dùng hql là bỏ nqtiveQuery
    //    @Query(nativeQuery = true, "câu lệnh sql")
    // tên method
}
