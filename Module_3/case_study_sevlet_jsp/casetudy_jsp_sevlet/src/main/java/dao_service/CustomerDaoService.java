package dao_service;

import dao_repository.ICustomerDaoRepository;
import dao_repository.CustomerDaoRepository;
import model.Customer;

import java.util.List;
import java.util.regex.Pattern;

public class CustomerDaoService implements  ICustomerDaoService {
    private ICustomerDaoRepository userDaoRepository = new CustomerDaoRepository();
    public static final  String REGEX_PHONE = "^\\([0-9]{2}\\)-\\(0+[1-9]{9}\\)$";
    Pattern pattern = Pattern.compile(REGEX_PHONE);
    public static final String REGEX_NAME = "^KH-$";

    @Override
    public List<Customer> findAll() {
        return userDaoRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        // validate dữ liệu
//        if (!pattern.matcher().matches()) {
//            System.out.println(" !! false phone number ");
//        }


        return userDaoRepository.add(customer);
    }

    @Override
    public Customer findById(int idC) {
        return userDaoRepository.findById(idC);
    }

    public void update(Customer customer) {
        userDaoRepository.update(customer);
    }

    @Override
    public void remove(int id) {
        userDaoRepository.remove(id);
    }

    public List<Customer> findCountry(String country) {
        return userDaoRepository.findCountry(country);
    }

    public List<Customer> SortByName(){
        return userDaoRepository.SortByName();
    }



}
