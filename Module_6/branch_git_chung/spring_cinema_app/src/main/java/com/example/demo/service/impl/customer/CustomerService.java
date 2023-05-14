package com.example.demo.service.impl.customer;

import com.example.demo.model.account.Account;
import com.example.demo.model.customer.Customer;
import com.example.demo.repository.customer.ICustomerRepository;
import com.example.demo.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public Customer findCustomerByAccount(Account account) {
        return iCustomerRepository.findCustomerByAccount(account.getUsername());
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }


    @Override
    public void updateCustomer(Customer customer) {
        iCustomerRepository.updateCustomer(customer.getFullName(), customer.getBirthday(), customer.getGender(), customer.getCardId(),
                customer.getEmail(), customer.getAddress(), customer.getPhoneNumber(), customer.getId());
    }

    @Override
    public Customer findCustomerByUsername(String username) {
        return iCustomerRepository.findCustomerByUsername(username);
    }

    @Override
    public Optional<Customer> findById(String id) {
        return iCustomerRepository.findById(id);
    }

}