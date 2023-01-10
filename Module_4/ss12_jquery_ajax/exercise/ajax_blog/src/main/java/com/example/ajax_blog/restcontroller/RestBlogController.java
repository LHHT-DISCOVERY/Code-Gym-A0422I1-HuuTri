package com.example.ajax_blog.restcontroller;

import com.example.ajax_blog.model.Blog;
import com.example.ajax_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/api/blog")
public class RestBlogController {
    @Autowired
    private IBlogService iBlogService;


    @GetMapping("/list")
    public ResponseEntity<List<Blog>> list() {
        List<Blog> blogList = iBlogService.findAll();
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<List<Blog>> listResponseEntity(@RequestParam(value = "name", defaultValue = "") String name) {
        List<Blog> blogs = "".equals(name) ? iBlogService.findAll() : iBlogService.findByName(name);
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

}
