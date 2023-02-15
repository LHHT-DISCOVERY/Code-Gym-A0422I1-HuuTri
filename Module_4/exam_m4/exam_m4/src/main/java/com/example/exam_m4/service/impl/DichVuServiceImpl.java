package com.example.exam_m4.service.impl;

import com.example.exam_m4.model.DichVu;
import com.example.exam_m4.repository.IDichVuRepository;
import com.example.exam_m4.service.IDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuServiceImpl  implements IDichVuService {
    @Autowired
    IDichVuRepository iDichVuRepository ;
    @Override
    public List<DichVu> findAll() {
        return iDichVuRepository.findAll();
    }

    @Override
    public DichVu createOrrUpdate(DichVu dichVu) {
        return iDichVuRepository.save(dichVu);
    }

    @Override
    public DichVu findById(int id) {
        return iDichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iDichVuRepository.deleteById(id);
    }

    @Override
    public List<DichVu> findName(String name) {
        return iDichVuRepository.findName(name);
    }


}
