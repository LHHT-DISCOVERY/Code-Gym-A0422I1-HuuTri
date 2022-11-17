package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test2Repository implements ITest2Repository {
//    private static final String SELECT_ALL = "select *from Payment";
//    @Override
//    public List<Payment> findAll() {
//        List<Payment> payments = new ArrayList<>();
//        try (Connection connection = BaseRepository.getConnectDB();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                int idPayment = rs.getInt("idPayMent");
//                String namePayment = rs.getString("namePayment");
//                Payment payment = new Payment(idPayment,namePayment);
//                payments.add(payment);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return payments;
//    }
}
