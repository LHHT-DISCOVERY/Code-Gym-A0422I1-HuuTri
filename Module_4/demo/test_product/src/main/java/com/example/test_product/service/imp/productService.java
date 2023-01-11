package com.example.test_product.service.imp;

import com.example.test_product.model.Product;
import com.example.test_product.repository.IProductRepository;
import com.example.test_product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService implements IProductService {

    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void createOrUpdate(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void findById(int id) {
        iProductRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        iProductRepository.deleteById(id);
    }
}
