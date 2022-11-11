package dao_repository;

import model.TypeCustomer;

import java.util.List;

public interface ITypeCustomerRepository {
    List<TypeCustomer> findAll();
}
