package com.example.blog_applycation.service;

import com.example.blog_applycation.model.Blog;
import com.example.blog_applycation.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void createOrUpdate(Category blog);

    Category findById(int id);

    void deleteById(int id);
}
