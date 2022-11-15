package service;

import model.HocSinh;
import repository.HocSinhRepository;
import repository.IHocSinhRepository;

import java.util.List;

public class HocSinhService implements IHocSinhService{
    private IHocSinhRepository   iHocSinhRepository = new HocSinhRepository();
    @Override
    public List<HocSinh> findAll() {
        return iHocSinhRepository.findAll();
    }
}
