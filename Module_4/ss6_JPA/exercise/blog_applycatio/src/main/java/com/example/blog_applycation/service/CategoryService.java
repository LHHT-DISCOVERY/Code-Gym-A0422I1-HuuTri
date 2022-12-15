package com.example.blog_applycation.service;

import com.example.blog_applycation.model.Category;
import com.example.blog_applycation.repository.ICategoryRepository;
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
    public void createOrUpdate(Category category) {
        iCategoryRepository.save(category);

    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iCategoryRepository.deleteById(id);
    }
}
