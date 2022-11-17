package service;

import model.Objectt;
import repository.ITestRepository;
import repository.TestRepository;

import java.sql.SQLException;
import java.util.List;

public class TestService  implements  ITestService{

    static ITestRepository iTestRepository  = new TestRepository();


//    @Override
//    public void insert(Room room) throws SQLException {
//        iTestRepository.insert(room);
//    }
//
//
//    @Override
//    public Room select(int idRoom) {
//        return iTestRepository.selectCustomer(idRoom);
//    }
//
//
//    @Override
//    public List<Room> findAll() {
//        return iTestRepository.findAll();
//    }
//
//    @Override
//    public boolean delete(int idRoom) throws SQLException {
//        return iTestRepository.deleteRom(idRoom);
//    }
//
//
//    @Override
//    public boolean update(Room room) throws SQLException {
//        return iTestRepository.updateRom(room);
//    }
//
//
//    @Override
//    public List<Room> search(String searchName, String searchNumberPhone, String idPayment_room) {
//
//        return iTestRepository.search(searchName,searchNumberPhone,idPayment_room);
//    }

}
