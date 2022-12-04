package com.service.impl;

import com.bean.Product;
import com.repository.IProductRepository;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository iProductRepository ;

    @Override
    public List<Product> show() {
        return iProductRepository.show();
    }

    @Override
    public void createOrUpdate(Product product) {
        iProductRepository.createOrUpdate(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById( id);
    }

    @Override
    public List<Product> findByName( String name) {
        return iProductRepository.findByName(name);
    }

    @Override
    public void deleteById(int id ) {
        iProductRepository.deleteById(id);
    }

}
