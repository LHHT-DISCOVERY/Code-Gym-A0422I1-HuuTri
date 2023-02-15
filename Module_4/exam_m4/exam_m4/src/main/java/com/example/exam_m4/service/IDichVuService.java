package com.example.exam_m4.service;

import com.example.exam_m4.model.DichVu;
import com.example.exam_m4.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDichVuService {
    List<DichVu> findAll();
    DichVu createOrrUpdate(DichVu dichVu);
    DichVu findById(int id);
    void deleteById(int id);

    List<DichVu> findName(String name);
}
