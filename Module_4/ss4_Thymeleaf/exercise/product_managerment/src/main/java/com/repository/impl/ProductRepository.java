package com.repository.impl;

import com.bean.Product;
import com.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {

    private static Map< Integer ,Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"ti-vi-1" , 120.0 , "samsung" ,"LG"));
        products.put(2,new Product(2,"ti-vi-2" , 140.0 , "LG" ,"LG"));
        products.put(3,new Product(3,"ti-vi-1" , 190.0 , "MAC" ,"LG"));
        products.put(4,new Product(4,"ti-vi-2" , 160.0 , "Xiaomi" ,"LG"));
        products.put(5,new Product(5,"ti-vi-1" , 170.0 , "Panasonic" ,"LG"));
        products.put(6,new Product(6,"ti-vi-2" , 150.0 , "Xiaomi" ,"LG"));
    }


    @Override
    public List<Product> show() {
        return new ArrayList<>(products.values());
    }


    public void createOrUpdate(Product product) {
         products.put(product.getId() ,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id) ;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList= new ArrayList<>(products.values());
        List<Product> rs = new ArrayList<>();
        for (Product p:productList
             ) {
            if(p.getName().equals(name)){
                 rs.add(p);
            }
        }
        return rs;
    }

    @Override
    public void deleteById(int id) {
        products.remove(id);
    }
}
