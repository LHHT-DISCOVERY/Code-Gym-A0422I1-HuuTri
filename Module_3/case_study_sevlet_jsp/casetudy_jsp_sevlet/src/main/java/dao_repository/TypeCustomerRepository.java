package dao_repository;

import model.Customer;
import model.TypeCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeCustomerRepository implements ITypeCustomerRepository {
    @Override
    public List<TypeCustomer> findAll() {
        List<TypeCustomer> ListtypeCustomer = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from customer_type;");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_type_name");
                TypeCustomer typeCustomer = new TypeCustomer(id,name);
                ListtypeCustomer.add(typeCustomer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ListtypeCustomer;
    }

    public static void main(String[] args) {
        TypeCustomerRepository customerListType = new TypeCustomerRepository();
        List<TypeCustomer> list = customerListType.findAll();
        for (TypeCustomer customer : list
        ) {

            System.out.println(customer.getName());
        }
    }
}
