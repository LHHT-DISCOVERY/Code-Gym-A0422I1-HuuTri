package com.example.blog_applycation.repository;

import com.example.blog_applycation.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

//     đây là viết ra câu lệnh sql thuần'= , còn nếu ko dùng hql là bỏ nqtiveQuery
//    @Query(nativeQuery = true, "câu lệnh sql")
    List<Blog> findAllByCategory_IdBlog(int idBlog);
}
