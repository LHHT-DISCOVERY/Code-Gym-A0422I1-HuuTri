package com.example.restful_api_blog.service;

import com.example.restful_api_blog.model.Blog;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void createOrUpdate(Blog blog);
    Blog findById(int id);
    void deleteByd(int id);
    List<Blog>  listBlogByIdCategory(int idBlog);

}
