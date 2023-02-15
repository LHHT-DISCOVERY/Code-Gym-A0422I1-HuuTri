package com.example.exam_module.service;

import com.example.exam_module.model.KhuyenMai;

import java.util.List;

public interface IKhuyenhMaiService {
    List<KhuyenMai> findAll();

    KhuyenMai createOrUpdate(KhuyenMai khuyenMai);

    void deleteById(int id);

    KhuyenMai findById(int id);

    List<KhuyenMai> findMKM(double name);

}
