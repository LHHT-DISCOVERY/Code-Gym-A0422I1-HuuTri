package dao_repository;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoRepository implements dao_repository.IUserDaoRepository {
    private final String SELECT_ALL = "SELECT * FROM users;";
    private final String INSERT_USER = "insert into users(`name` , email , country)\n" +
            "values(?,?,?)";
    private final String GET_INFO = "   select * from users \n" + " where id = ?;";
    private final String UPDATE_USER = " call update_user(?,?,?,?)";
    private final String DELETE_USER = "delete from users where id = ?";
    private final String FIND_COUNTRY = "    select * from users \n" +
            "    where country like ?;";
    private final String SORT_BY_NAME = "    select * from users \n" +
            "    order by `name` ASC;";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    @Override
    public boolean add(User user) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_USER); // set theo kieu DB
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getCountry());
            int effectRow = ps.executeUpdate(); //
            return effectRow > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User findById(int id) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement statement = connection.prepareStatement(GET_INFO);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            // do có câu lệnh trả về nên dùng executeQuery để return
            while (resultSet.next()) {
                int idDb = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(idDb, name, email, country);
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void update(User user) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            CallableStatement statement = connection.prepareCall(UPDATE_USER);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getCountry());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void remove(int id) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_USER);
            ps.setInt(1, id);
            // ko có câu lệnh trả về nên dùng executeUpdate ;
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> findCountry(String countryC) {
        List<User> userList = new ArrayList<>();
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement statement = connection.prepareStatement(FIND_COUNTRY);
            statement.setString(1, countryC);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> SortByName() {
        List<User> userList = new ArrayList<>();
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SORT_BY_NAME);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id,name,email,country);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

}
