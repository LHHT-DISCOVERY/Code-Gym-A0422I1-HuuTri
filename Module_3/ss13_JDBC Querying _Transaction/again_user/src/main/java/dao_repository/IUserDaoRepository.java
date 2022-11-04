package dao_repository;

import model.User;

import java.util.List;

public interface IUserDaoRepository {
    List<User> findAll();

    public boolean add(User user);

    public User findById(int id);

    public void update(User user);

    public void remove(int id);

    public List<User> findCountry(String country);

    public List<User> SortByName();
}
