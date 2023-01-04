package com.example.restful_api_blog.service.imp;

import com.example.restful_api_blog.model.Blog;
import com.example.restful_api_blog.repository.IBlogRepository;
import com.example.restful_api_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService  implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

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
    public void deleteByd(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public List<Blog> listBlogByIdCategory(int idBlog) {
        return iBlogRepository.listBlogByIdCategory(idBlog);
    }
}
