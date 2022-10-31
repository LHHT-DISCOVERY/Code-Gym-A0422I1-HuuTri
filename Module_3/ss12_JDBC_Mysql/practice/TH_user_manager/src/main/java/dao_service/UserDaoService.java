package dao_service;

import dao_repository.IUserDaoRepository;
import dao_repository.UserDaoRepository;
import model.User;

import java.util.List;

public class UserDaoService implements IUserDaoService {
    private IUserDaoRepository userDaoRepository = new UserDaoRepository();

    @Override
    public List<User> findAll() {
        return userDaoRepository.findAll();
    }

    @Override
    public boolean add(User user) {
        return userDaoRepository.add(user);
    }

    @Override
    public User findById(int idC) {
        return userDaoRepository.findById(idC);
    }

    public void update(User user) {
        userDaoRepository.update(user);
    }

    @Override
    public void remove(int id) {
        userDaoRepository.remove(id);
    }

    public List<User> findCountry(String country) {
        return userDaoRepository.findCountry(country);
    }

    public List<User> SortByName(){
        return userDaoRepository.SortByName();
    }



}
