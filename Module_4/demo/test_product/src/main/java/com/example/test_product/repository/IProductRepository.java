package com.example.test_product.repository;

import com.example.test_product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where p.productType.idProductType= :id")
    List<Product> findAllByIdProductType(@RequestParam("id") int id);
}
