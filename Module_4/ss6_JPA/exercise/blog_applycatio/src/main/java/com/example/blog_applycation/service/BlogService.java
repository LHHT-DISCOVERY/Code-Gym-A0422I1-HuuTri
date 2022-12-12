package com.example.blog_applycation.service;

import com.example.blog_applycation.model.Blog;
import com.example.blog_applycation.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService  implements  IBlogService{
    @Autowired
    IBlogRepository iBlogRepository ;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void createOrUpdate(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iBlogRepository.deleteById(id);
    }
}
