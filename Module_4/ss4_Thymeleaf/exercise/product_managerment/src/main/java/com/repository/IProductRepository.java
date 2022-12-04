package com.repository;

import com.bean.Product;

import java.util.List;

public interface IProductRepository {

    public List<Product> show();
    public void createOrUpdate(Product product);
    public Product findById(int id);
    public List<Product> findByName(String name);
    public void deleteById(int id );
}
