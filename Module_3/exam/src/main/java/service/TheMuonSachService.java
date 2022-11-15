package service;

import model.TheMuonSach;
import repository.ITheMuonSachRepository;
import repository.TheMuonSachRepository;

import java.util.List;

public class TheMuonSachService implements ITheMuonSachService {
    private ITheMuonSachRepository iTheMuonSachRepository = new TheMuonSachRepository();
    @Override
    public List<TheMuonSach> findAll() {
        return iTheMuonSachRepository.findAll();
    }
}
