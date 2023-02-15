package com.example.test_project.service.impl;

import com.example.test_project.model.Student;
import com.example.test_project.repository.IStudentRepository;
import com.example.test_project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository iStudentRepository;


    @Override
    public Page<Student> findAll(Pageable pageable) {
        return iStudentRepository.findAll(pageable);
    }

    @Override
    public Student createOrrUpdate(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return iStudentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        iStudentRepository.deleteById(id);
    }

    @Override
    public Page<Student> findByName(String name, Pageable pageable) {
        return iStudentRepository.findName(name, pageable);
    }
}
