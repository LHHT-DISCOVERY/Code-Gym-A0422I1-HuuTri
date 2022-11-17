package service;

import model.Room;
import reponsitory.IRoomReponsitory;
import reponsitory.iml.RoomReponsitory;

import java.sql.SQLException;
import java.util.List;

public class RoomService implements IRoomService{
    IRoomReponsitory roomReponsitory = new RoomReponsitory();
    @Override
    public void insert(Room room) throws SQLException {
        roomReponsitory.insert(room);
    }


    @Override
    public Room selectCustomer(int idRoom) {
        return roomReponsitory.selectCustomer(idRoom);
    }

    @Override
    public List<Room> findAll() {
        return roomReponsitory.findAll();
    }

    @Override
    public boolean deleteRom(int idRoom) throws SQLException {
        return roomReponsitory.deleteRom(idRoom);
    }

    @Override
    public boolean updateRom(Room room) throws SQLException {
        return roomReponsitory.updateRom(room);
    }

    @Override
    public List<Room> search(String searchName, String searchNumberPhone, String idPayment_room) {

        return roomReponsitory.search(searchName,searchNumberPhone,idPayment_room);
    }
}
