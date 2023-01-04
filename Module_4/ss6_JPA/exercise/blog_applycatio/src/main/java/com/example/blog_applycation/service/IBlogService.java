package com.example.blog_applycation.service;

import com.example.blog_applycation.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void createOrUpdate(Blog blog);


    Blog findById(int id);

    List<Blog> findAllByCategory_IdBlog(int idBlog);

    void update(int id , String name , String content);

    void deleteById(int id);

}
