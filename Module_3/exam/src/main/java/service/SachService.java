package service;

import model.Sach;
import repository.ISachRepository;
import repository.SachRepository;

import java.sql.SQLException;
import java.util.List;

public class SachService implements ISachService {
    ISachRepository iSachRepository = new SachRepository();



    @Override
    public List<Sach> findAll() {
        return iSachRepository.findAll();
    }

    @Override
    public Sach select(int id) {
        return  iSachRepository.select(id);
    }


    @Override
    public List<Sach> search(String searchName, String searchNumberPhone, String idPayment_room) {
        return iSachRepository.search(searchName, searchNumberPhone, idPayment_room);
    }
}
