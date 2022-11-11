package dao_service;

import dao_repository.CustomerDaoRepository;
import dao_repository.ICustomerDaoRepository;
import dao_repository.ITypeCustomerRepository;
import dao_repository.TypeCustomerRepository;
import model.TypeCustomer;

import java.util.List;

public class TypeCustomerService implements  ITypeCustomerService{
    private ITypeCustomerRepository iCustomerDaoRepository = new TypeCustomerRepository();
    @Override
    public List<TypeCustomer> findAll() {
       return iCustomerDaoRepository.findAll();
    }
}
