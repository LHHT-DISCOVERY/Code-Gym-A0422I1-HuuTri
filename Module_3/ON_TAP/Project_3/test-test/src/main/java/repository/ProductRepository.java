package repository;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String SELECT_ALL_PRODUCT = "select*from product";
    private static final String INSERT = "insert into product(`name`, price, product_type, description_product) value (?,?,?,?);";
    private static final String DELETE = "delete from product where id = ?;";
    private static final String SEARCH = "select*from Room where customer_name like ? and sdt like ? and idPayMent like ?";
    private static final String UPDATE = "update product set name = ? , price = ? , product_type = ? ,  description_product = ? where id = ?";
    private static final String FIND_BY_ID = "select * from product where id =?";

    @Override
    public void insert(Product product) throws SQLException {
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getProductType());
            preparedStatement.setString(4, product.getProductDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product select(int idc) {
        Product product = null;
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);) {
            preparedStatement.setInt(1, idc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String productType = rs.getString("product_type");
                String productDescription = rs.getString("description_product");
                product = new Product(id, name, price, productType, productDescription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;

    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String productType = rs.getString("product_type");
                String productDescription = rs.getString("description_product");
                productList.add(new Product(id, name, price, productType, productDescription));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = BaseRepository.getConnectDB(); PreparedStatement statement = connection.prepareStatement(DELETE)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = BaseRepository.getConnectDB(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getProductType());
            preparedStatement.setString(4, product.getProductDescription());
            preparedStatement.setInt(5, product.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public List<Product> search(String searchName, String searchNumberPhone, String idPayment_room) {
//        List<Room> rooms = new ArrayList<>();
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement pr= connection.prepareStatement(SEARCH);
//            pr.setString(1,"%"+ searchName +"%");
//            pr.setString(2,"%"+ searchNumberPhone+ "%");
//            pr.setString(3, "%"+idPayment_room+"%");
//            ResultSet resultSet = pr.executeQuery();
//            while (resultSet.next()){
//                int id = resultSet.getInt("room_id");// columnLable : tên trường trong database// get theo kiểu dữ liệu của Java
//                String name = resultSet.getString("customer_name");
//                int sdt = resultSet.getInt("sdt");
//                String ngayBatDau = resultSet.getString("ngayBatDau");
//                int idPayMent = resultSet.getInt("idPayMent");
//                Room product = new Room(id,name,sdt,ngayBatDau,idPayMent);
//                rooms.add(product);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return rooms;
        return null;
    }


    public static void main(String[] args) {
        ProductRepository objectRepository = new ProductRepository();
        Product product = objectRepository.select(1);
        System.out.println(product.getName());
    }

}
