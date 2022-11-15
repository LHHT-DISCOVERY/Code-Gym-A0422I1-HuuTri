package service;

import model.HoKhau;
import repository.HoKhauRepository;
import repository.IHoKhauRepository;

import java.util.List;

public class HoKhauService implements IHoKhauService{
    private IHoKhauRepository hoKhauRepository = new HoKhauRepository();
    @Override
    public List<HoKhau> findAll() {
        return hoKhauRepository.findAll();
    }
}
