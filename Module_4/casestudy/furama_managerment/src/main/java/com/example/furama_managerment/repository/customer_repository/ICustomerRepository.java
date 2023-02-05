package com.example.furama_managerment.repository.customer_repository;

import com.example.furama_managerment.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
