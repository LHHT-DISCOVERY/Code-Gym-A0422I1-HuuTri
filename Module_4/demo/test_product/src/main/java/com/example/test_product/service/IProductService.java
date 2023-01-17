package com.example.test_product.service;

import com.example.test_product.model.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void createOrUpdate(Product product);
    void findById(int id);
    void deleteById(int id);
    List<Product> findAllByIdProductType(@RequestParam("id") int id);
}
