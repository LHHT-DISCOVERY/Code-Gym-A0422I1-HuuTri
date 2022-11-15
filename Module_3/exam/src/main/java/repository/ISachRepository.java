package repository;

import model.Sach;

import java.sql.SQLException;
import java.util.List;

public interface ISachRepository {

    // hiển thị tất cả danh sách
    List<Sach> findAll();

    Sach select(int id);


    // tìm kiếm theo tên sdt id payment
    List<Sach> search(String searchName, String searchNumberPhone, String idPayment_room);

}
