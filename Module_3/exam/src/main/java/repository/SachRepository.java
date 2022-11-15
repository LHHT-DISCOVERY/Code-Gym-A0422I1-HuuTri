package repository;

import model.Sach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SachRepository implements ISachRepository {

    private static final String SELECT_ALL_SACH = "select * from  sach;";
    private static final String FIND_BY_ID = "select * from sach where ma_sach =?";


    @Override
    public List<Sach> findAll() {
        List<Sach> sachList = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SACH)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maSach = rs.getInt("ma_sach");
                String tenSach = rs.getString("ten_sach");
                String tacGia = rs.getString("tac_gia");
                String moTa = rs.getString("mo_ta");
                int soLuong = rs.getInt("so_luong");
                sachList.add(new Sach(maSach, tenSach, tacGia, moTa, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sachList;
    }

    @Override
    public Sach select(int id) {
        Sach sach = null;
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maSach = rs.getInt("ma_sach");
                String tenSach = rs.getString("ten_sach");
                String tacGia = rs.getString("tac_gia");
                String moTa = rs.getString("mo_ta");
                int soLuong = rs.getInt("so_luong");
                sach = new Sach(maSach, tenSach, tacGia, moTa, soLuong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sach;
    }


    @Override
    public List<Sach> search(String searchName, String searchNumberPhone, String idPayment_room) {
        return null;
    }


    public static void main(String[] args) {
        SachRepository objectRepository = new SachRepository();
        for (Sach objectt : objectRepository.findAll()
        ) {
            System.out.println(objectt.getTenSach());
        }
    }

}
