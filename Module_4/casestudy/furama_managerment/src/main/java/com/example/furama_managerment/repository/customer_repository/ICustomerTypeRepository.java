package com.example.furama_managerment.repository.customer_repository;

import com.example.furama_managerment.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
