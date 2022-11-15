package reponsitory.iml;

import model.Room;
import reponsitory.IRoomReponsitory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomReponsitory implements IRoomReponsitory {


    private static final String SELECT_ALL_USERS = "select*from Room;";
    private static final String INSERT_USERS_SQL = "insert into Room(customer_name,sdt,ngayBatDau,idPayMent) values (?,?,?,?);";
    private static final String SELECT_USER_BY_ID = "select room_id,customer_name,sdt,ngayBatDau,idPayMent from Room where room_id =?";
    private static final String DELETE_USERS_SQL = "delete from Room where room_id = ?;";
    private static final String UPDATE_USERS_SQL = "update Room set customer_name = ?,sdt = ?,ngayBatDau = ?,idPayMent = ?  where room_id = ?";
    private static final String SEARCH = "select*from Room where customer_name like ? and sdt like ? and idPayMent like ?";

    @Override
    public void insert(Room room) throws SQLException {
        try (Connection connection = BaseRepository.getConnectDB(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, room.getNameCustomer());
            preparedStatement.setInt(2, room.getNumberPhone());
            preparedStatement.setDate(3, Date.valueOf(room.getNgayBatDau()));
            preparedStatement.setInt(4, room.getIdPayment_room());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Room selectCustomer(int idRoom) {
        Room room = null;
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, idRoom);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("customer_name");
                int sDT = rs.getInt("sdt");
                String ngayBatDau = rs.getString("ngayBatDau");
                int idPayMent = rs.getInt("idPayMent");
                room = new Room(idRoom,name,sDT,ngayBatDau,idPayMent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return room;
    }

    @Override
    public List<Room> findAll() {

        List<Room> rooms = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idRoom = rs.getInt("room_id");
                String nameCustomer = rs.getString("customer_name");
                int numberPhone = rs.getInt("sdt");
                String ngayBatDau = rs.getString("ngayBatDau");
                int idPayment_room = rs.getInt("idPayMent");
                rooms.add(new Room(idRoom, nameCustomer, numberPhone, ngayBatDau, idPayment_room));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    @Override
    public boolean deleteRom(int idRoom) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = BaseRepository.getConnectDB(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL)) {
            statement.setInt(1, idRoom);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean updateRom(Room room) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = BaseRepository.getConnectDB(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {

            statement.setString(1, room.getNameCustomer());
            statement.setInt(2, room.getNumberPhone());
            statement.setDate(3, Date.valueOf(room.getNgayBatDau()));
            statement.setInt(4, room.getIdPayment_room());
            statement.setInt(5, room.getIdRoom());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public List<Room> search(String searchName, String searchNumberPhone, String idPayment_room) {
        List<Room> rooms = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr= connection.prepareStatement(SEARCH);
            pr.setString(1,"%"+ searchName +"%");
            pr.setString(2,"%"+ searchNumberPhone+ "%");
            pr.setString(3, "%"+idPayment_room+"%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("room_id");// columnLable : tên trường trong database// get theo kiểu dữ liệu của Java
                String name = resultSet.getString("customer_name");
                int sdt = resultSet.getInt("sdt");
                String ngayBatDau = resultSet.getString("ngayBatDau");
                int idPayMent = resultSet.getInt("idPayMent");
                Room room = new Room(id,name,sdt,ngayBatDau,idPayMent);
                rooms.add(room);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rooms;
    }
}
