package com.example.restful_api_blog.service;

import com.example.restful_api_blog.model.Category;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int id);
    void createOrrUpdate(Category category);
    void deleteById(int id);
}
