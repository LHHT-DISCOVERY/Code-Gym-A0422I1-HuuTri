package com.example.test_product.service;

import com.example.test_product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void createOrUpdate(Product product);
    void findById(int id);
    void deleteById(int id);
}
