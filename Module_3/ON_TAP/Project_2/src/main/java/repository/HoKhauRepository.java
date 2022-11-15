package repository;

import model.HoKhau;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoKhauRepository implements IHoKhauRepository {
    private String SELECT_ALL_HO_KHAU = "select * from ho_khau ;";
    private String SELECT_ALL_THANH_VIEN = " select * from thanh_vien where ma_ho_khau = ? ;";


    public List<HoKhau> findAll() {
        List<HoKhau> hoKhauList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_HO_KHAU);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int maHoKhau = resultSet.getInt("ma_ho_khau");
                String tenChuHo = resultSet.getString("ten_chu_ho");
                int sl = resultSet.getInt("sl");
                Date ngayLapHoKhau = resultSet.getDate("ngay_lap_ho_khau");
                String diaChi = resultSet.getString("dia_chi");
                HoKhau hoKhau = new HoKhau(maHoKhau, tenChuHo, sl, ngayLapHoKhau, diaChi);
                hoKhauList.add(hoKhau);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoKhauList;
    }

    public static void main(String[] args) {
        HoKhauRepository hoKhauRepository = new HoKhauRepository();
        for (HoKhau khau: hoKhauRepository.findAll()
             ) {
            System.out.println(khau.getMaHoKhau());
        }
    }
}
