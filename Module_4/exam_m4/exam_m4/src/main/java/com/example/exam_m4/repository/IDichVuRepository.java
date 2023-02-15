package com.example.exam_m4.repository;

import com.example.exam_m4.model.DichVu;
import com.example.exam_m4.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDichVuRepository extends JpaRepository<DichVu , Integer> {
    @Query("select e from DichVu  e where e.khachHang.name like %:name%")
    List<DichVu> findName(@Param("name") String name );

}
