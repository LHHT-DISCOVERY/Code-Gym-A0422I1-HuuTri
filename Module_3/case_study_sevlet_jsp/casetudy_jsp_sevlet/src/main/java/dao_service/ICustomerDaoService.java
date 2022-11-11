package dao_service;

import model.Customer;

import java.util.List;

public interface ICustomerDaoService {
    List<Customer> findAll();

    public boolean add(Customer user);

    public Customer findById(int id);

    public void update(Customer customer);

    public void remove(int id);

    public List<Customer> findCountry(String country);

    public List<Customer> SortByName();

}
