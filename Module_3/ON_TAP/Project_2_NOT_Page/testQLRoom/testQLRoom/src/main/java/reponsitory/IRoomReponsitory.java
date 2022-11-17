package reponsitory;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface IRoomReponsitory {
    // thêm mới
    void insert(Room room) throws SQLException;
    // hiển thị thông tin cần sửa
    Room selectCustomer(int idRoom);

    // hiển thị tất cả danh sách
    List<Room> findAll();
    // xóa theo id
    boolean deleteRom(int idRoom) throws SQLException;
    // sửa thông tin khách hàng
    boolean updateRom(Room room) throws SQLException;
    // tìm kiếm theo tên sdt id payment
    List<Room> search(String searchName, String searchNumberPhone, String idPayment_room);
}
