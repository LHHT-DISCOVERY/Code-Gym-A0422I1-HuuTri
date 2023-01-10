package com.example.ajax_blog.service;

import com.example.ajax_blog.model.Blog;
import com.example.ajax_blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void createOrUpdate(Category blog);

    Category findById(int id);

    void deleteById(int id);
}
