package com.example.furama_managerment.service.customer_service;

import com.example.furama_managerment.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    void createOrUpdate(Customer customer);

    Page<Customer> findAll(Pageable pageable);

    Customer findById(int id);

    void deleteById(int id);
}
