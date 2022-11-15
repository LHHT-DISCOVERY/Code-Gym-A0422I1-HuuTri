package repository;

import model.HocSinh;
import model.Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocSinhRepository implements IHocSinhRepository {
    private static final String SELECT_ALL_SACH = "select * from  hoc_sinh;";


    @Override
    public List<HocSinh> findAll() {
        List<HocSinh> hocSinhList = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SACH)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int maHocSinh = rs.getInt("ma_hoc_sinh");
                String hoTen = rs.getString("ho_ten");
                String lop = rs.getString("lop");
                hocSinhList.add(new HocSinh(maHocSinh,hoTen,lop));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hocSinhList;
    }
}
