package repository;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheMuonSachRepository implements  ITheMuonSachRepository{
    private static final String SELECT_ALL_THE_MUON_SACH = "select * from  hoc_sinh;";
    @Override
    public List<TheMuonSach> findAll() {
        List<TheMuonSach> theMuonSachList = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_THE_MUON_SACH)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maMuonSach = rs.getInt("ma_muon_sach");
                Boolean trangThai = rs.getBoolean("trang_thai");
                Date ngayMuon = rs.getDate("ngay_muon");
                Date ngayTra = rs.getDate("ngay_tra");
                int maSach = rs.getInt("ma_sach");
                int maHocSinh = rs.getInt("ma_hoc_sinh");
                theMuonSachList.add(new TheMuonSach(maMuonSach,maSach,maHocSinh,trangThai,ngayMuon,ngayTra));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return theMuonSachList;
    }

    @Override
    public Sach select(int id) {
        return null;
    }
}
