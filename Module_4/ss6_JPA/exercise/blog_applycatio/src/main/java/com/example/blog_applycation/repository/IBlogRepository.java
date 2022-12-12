package com.example.blog_applycation.repository;

import com.example.blog_applycation.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

}
