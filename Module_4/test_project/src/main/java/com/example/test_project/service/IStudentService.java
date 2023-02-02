package com.example.test_project.service;

import com.example.test_project.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    Student createOrrUpdate(Student student);
    Student findById(Long id);
    void deleteById(Long id);
}
