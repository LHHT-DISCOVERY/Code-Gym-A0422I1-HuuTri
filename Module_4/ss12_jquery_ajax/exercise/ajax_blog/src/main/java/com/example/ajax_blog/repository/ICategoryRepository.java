package com.example.ajax_blog.repository;

import com.example.ajax_blog.model.Category;
import com.example.ajax_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
