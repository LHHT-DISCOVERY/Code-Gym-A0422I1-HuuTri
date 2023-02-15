package com.example.exam_m4.service.impl;

import com.example.exam_m4.model.KhachHang;
import com.example.exam_m4.repository.IKhachHangRepository;
import com.example.exam_m4.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements IKhachHangService {
    @Autowired
    IKhachHangRepository iKhachHangRepository;

    @Override
    public List<KhachHang> findAll() {
        return iKhachHangRepository.findAll();
    }

    @Override
    public KhachHang createOrrUpdate(KhachHang khachHang) {
        return iKhachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang findById(int id) {
        return iKhachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iKhachHangRepository.deleteById(id);
    }

    @Override
    public List<KhachHang> findByName(String name) {
        return iKhachHangRepository.findName(name);
    }
}
