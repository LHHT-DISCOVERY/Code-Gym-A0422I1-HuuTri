package com.example.test_product.repository;

import com.example.test_product.model.Product;
import com.example.test_product.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IProductTypeRepository extends JpaRepository<ProductType, Integer> {

}
