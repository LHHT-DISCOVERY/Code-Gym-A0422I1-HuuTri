package dao_repository;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoRepository implements ICustomerDaoRepository {
    private final String SELECT_ALL = " select * from customer ;";
    private final String INSERT_USER = "insert into `customer` (customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)\n" +
            "values(?,?,?,?,?,?,?,?,?)";
    private final String GET_INFO = " select * from customer  where customer_id = ? ;";
    private final String UPDATE_USER = " call update_customer(?,?,?,?,?,?,?,?,?)";
    private final String DELETE_USER = "delete from customer \n" +
            "where customer_id = ?;";
    private final String FIND_COUNTRY = "select * from customer where customer_address like ?;";
    private final String SORT_BY_NAME = "    select * from users \n" +
            "    order by `name` ASC;";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            CallableStatement pr = connection.prepareCall(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                int customerType = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");

                Customer customer = new Customer(customerId, customerType, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_USER); // set theo kieu DB
            ps.setInt(1, customer.getCustomerId());
            ps.setInt(2, customer.getCustomerType());
            ps.setString(3, customer.getCustomerName());
            ps.setString(4, customer.getCustomerBirthday());
            ps.setBoolean(5, customer.getCustomerGender());
            ps.setString(6, customer.getCustomerIdCard());
            ps.setString(7, customer.getCustomerPhone());
            ps.setString(8, customer.getCustomerEmail());
            ps.setString(9, customer.getCustomerAddress());
            int effectRow = ps.executeUpdate(); //
            return effectRow > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer findById(int id) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement statement = connection.prepareStatement(GET_INFO);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            // do có câu lệnh trả về nên dùng executeQuery để return
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                int customerType = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                Customer customer = new Customer(customerId, customerType, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
                return customer;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Customer customer) {
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            CallableStatement statement = connection.prepareCall(UPDATE_USER);
            statement.setInt(1, customer.getCustomerId());
            statement.setInt(2, customer.getCustomerType());
            statement.setString(3, customer.getCustomerName());
            statement.setString(4, customer.getCustomerBirthday());
            statement.setBoolean(5, customer.getCustomerGender());
            statement.setString(6, customer.getCustomerIdCard());
            statement.setString(7, customer.getCustomerPhone());
            statement.setString(8, customer.getCustomerEmail());
            statement.setString(9, customer.getCustomerAddress());
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

    @Override
    public List<Customer> findCountry(String country) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = dao_repository.BaseRepository.getConnectDB();
        try {
            PreparedStatement statement = connection.prepareStatement(FIND_COUNTRY);
            statement.setString(1, "%" + country + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                int customerType = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                Customer customer = new Customer(customerId, customerType, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
                customerList.add(customer);
            }
            return customerList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> SortByName() {
        return null;
    }

    public static void main(String[] args) {
        CustomerDaoRepository customerList = new CustomerDaoRepository();
        List<Customer> list = customerList.findCountry("Đà Nẵng");
        for (Customer customer : list
        ) {

            System.out.println(customer);
        }

        boolean s = Boolean.parseBoolean("0");
        System.out.println(s);
    }

}
