package com.example.exam_module.service;

import com.example.exam_module.model.KhuyenMai;
import com.example.exam_module.repository.IKhuyenMaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenhMaiService implements IKhuyenhMaiService {
    @Autowired
    IKhuyenMaiRepository iKhuyenMaiRepository;

    @Override
    public List<KhuyenMai> findAll() {
        return iKhuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai createOrUpdate(KhuyenMai khuyenMai) {
        return iKhuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public void deleteById(int id) {
        iKhuyenMaiRepository.deleteById(id);
    }

    @Override
    public KhuyenMai findById(int id) {
        return iKhuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public List<KhuyenMai> findMKM(double name) {
        return iKhuyenMaiRepository.findMKM(name);
    }
}
