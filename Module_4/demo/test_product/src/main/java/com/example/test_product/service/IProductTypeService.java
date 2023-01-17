package com.example.test_product.service;

import com.example.test_product.model.Product;
import com.example.test_product.model.ProductType;

import java.util.List;

public interface IProductTypeService {
    List<ProductType> findAll();
    void createOrUpdate(ProductType productType);
    void findById(int id);
    void deleteById(int id);

}
