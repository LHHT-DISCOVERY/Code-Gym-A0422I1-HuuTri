package com.example.test_project.service;

import com.example.test_project.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {

    Page<Student> findAll(Pageable pageable);
    Student createOrrUpdate(Student student);
    Student findById(Long id);
    void deleteById(Long id);
    Page<Student> findByName(String name , Pageable pageable);
}
