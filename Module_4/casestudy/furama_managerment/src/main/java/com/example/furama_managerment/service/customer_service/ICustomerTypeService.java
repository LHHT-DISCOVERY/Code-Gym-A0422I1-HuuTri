package com.example.furama_managerment.service.customer_service;

import com.example.furama_managerment.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
