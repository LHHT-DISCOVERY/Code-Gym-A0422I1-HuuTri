package com.example.test_product.service.imp;

import com.example.test_product.model.Product;
import com.example.test_product.model.ProductType;
import com.example.test_product.repository.IProductRepository;
import com.example.test_product.repository.IProductTypeRepository;
import com.example.test_product.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    IProductTypeRepository iProductTypeRepository ;

    @Override
    public List<ProductType> findAll() {
        return iProductTypeRepository.findAll();
    }


    @Override
    public void createOrUpdate(ProductType productType) {
        iProductTypeRepository.save(productType);
    }

    @Override
    public void findById(int id) {
        iProductTypeRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        iProductTypeRepository.deleteById(id);
    }
}
