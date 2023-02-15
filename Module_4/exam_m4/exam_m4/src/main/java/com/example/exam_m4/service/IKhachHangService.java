package com.example.exam_m4.service;

import com.example.exam_m4.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IKhachHangService {
    List<KhachHang> findAll();
    KhachHang createOrrUpdate(KhachHang khachHang);
    KhachHang findById(int id);
    void deleteById(int id);
    List<KhachHang> findByName(String name );
}
