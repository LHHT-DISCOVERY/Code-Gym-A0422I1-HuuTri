package repository;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {

    void insert(Product product) throws SQLException;

    // hiển thị thông tin cần sửa
    Product select(int idRoom);

    // hiển thị tất cả danh sách
    List<Product> findAll();

    // xóa theo id
    boolean delete(int idRoom) throws SQLException;

    // sửa
    boolean update(Product object) throws SQLException;

    // tìm kiếm theo tên sdt id payment
    List<Product> search(String searchName, String searchNumberPhone, String idPayment_room);

}
