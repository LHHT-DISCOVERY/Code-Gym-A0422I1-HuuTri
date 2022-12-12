package com.example.blog_applycation.service;

import com.example.blog_applycation.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll() ;
    void createOrUpdate(Blog blog);
    Blog findById(int id);
    void deleteById(int id);

}
