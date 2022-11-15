package repository;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;

import java.util.List;

public interface ITheMuonSachRepository {
    List<TheMuonSach> findAll();
    Sach select(int id);
}
