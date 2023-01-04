package com.example.restful_api_blog.restcontroller;

import com.example.restful_api_blog.model.Blog;
import com.example.restful_api_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class RestfulBlogController {

    @Autowired
    IBlogService iBlogService;

    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(iBlogService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list-blog/{id}")
    public ResponseEntity<List<Blog>> getListBlogById(@PathVariable("id") int id) {
        List<Blog> blogs = iBlogService.listBlogByIdCategory(id);
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") int id) {
        Blog blog = iBlogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
