package service;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface IRoomService {

    void insert(Room room) throws SQLException;

    Room selectCustomer(int idRoom);

    List<Room> findAll();

    boolean deleteRom(int idRoom) throws SQLException;

    boolean updateRom(Room room) throws SQLException;

    List<Room> search(String searchName, String searchNumberPhone, String idPayment_room);

    List<Room> findAllWithPaging(int pageNum, int pageSize);
}
