package com.example.exam_module.repository;

import com.example.exam_module.model.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {

    @Query("select e from KhuyenMai  e where e.mucGiamGia = :name ")
    List<KhuyenMai> findMKM(@Param("name") double name);
}
