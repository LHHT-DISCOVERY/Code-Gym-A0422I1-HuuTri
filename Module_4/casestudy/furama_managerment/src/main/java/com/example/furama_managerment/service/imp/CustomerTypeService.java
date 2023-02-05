package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.customer.CustomerType;
import com.example.furama_managerment.repository.customer_repository.ICustomerTypeRepository;
import com.example.furama_managerment.service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }
}
