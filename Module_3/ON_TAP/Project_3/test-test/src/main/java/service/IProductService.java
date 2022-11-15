package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    void insert(Product product) throws SQLException;

    // hiển thị thông tin cần sửa
    Product select(int idRoom);

    // hiển thị tất cả danh sách
    List<Product> findAll();

    // xóa theo id
    boolean delete(int idRoom) throws SQLException;

    // sửa thông tin khách hàng
    boolean update(Product product) throws SQLException;

    // tìm kiếm theo tên sdt id payment
    List<Product> search(String searchName, String searchNumberPhone, String idPayment_room);
}
