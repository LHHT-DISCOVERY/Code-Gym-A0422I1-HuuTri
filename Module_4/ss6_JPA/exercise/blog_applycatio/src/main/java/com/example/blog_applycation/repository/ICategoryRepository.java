package com.example.blog_applycation.repository;

import com.example.blog_applycation.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
