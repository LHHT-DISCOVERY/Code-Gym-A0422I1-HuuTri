package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.customer.Customer;
import com.example.furama_managerment.repository.customer_repository.ICustomerRepository;
import com.example.furama_managerment.service.customer_service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public void createOrUpdate(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iCustomerRepository.deleteById(id);
    }
}
