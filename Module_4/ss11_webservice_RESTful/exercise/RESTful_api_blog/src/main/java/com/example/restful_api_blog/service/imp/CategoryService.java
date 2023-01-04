package com.example.restful_api_blog.service.imp;

import com.example.restful_api_blog.model.Category;
import com.example.restful_api_blog.repository.ICategoryRepository;
import com.example.restful_api_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void createOrrUpdate(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void deleteById(int id) {
        iCategoryRepository.deleteById(id);
    }

}
