package com.example.ajax_blog.service;

import com.example.ajax_blog.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void createOrUpdate(Blog blog);


    Blog findById(int id);

    List<Blog> findByName(String name);

    List<Blog> findAllByCategory_IdBlog(int idBlog);

    void update(int id , String name , String content);

    void deleteById(int id);

}
