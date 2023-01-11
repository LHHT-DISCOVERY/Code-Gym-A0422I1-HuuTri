package com.example.test_product.service;

import com.example.test_product.model.Product;

public interface IProductTypeService {
    void createOrUpdate(Product product);
    void findById(int id);
    void deleteById(int id);
}
