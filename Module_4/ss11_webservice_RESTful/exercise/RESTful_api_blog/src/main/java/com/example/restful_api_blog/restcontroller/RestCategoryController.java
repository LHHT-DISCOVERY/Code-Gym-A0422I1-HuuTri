package com.example.restful_api_blog.restcontroller;

import com.example.restful_api_blog.model.Blog;
import com.example.restful_api_blog.model.Category;
import com.example.restful_api_blog.service.IBlogService;
import com.example.restful_api_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/api/category")
public class RestCategoryController {
    @Autowired
    private ICategoryService  iCategoryService;

    @Autowired
    private IBlogService iBlogService ;

    @GetMapping("/list")
    public ResponseEntity<List<Category>> getListCategory(){
        List<Category> categoryList = iCategoryService.findAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/{idBlog}")
    public ResponseEntity<List<Blog>> getNameCategory(@PathVariable("idBlog") int idBlog){
        List<Blog> category = iBlogService.listBlogByIdCategory(idBlog);
        return new ResponseEntity<>(category , HttpStatus.OK);
    }
}
