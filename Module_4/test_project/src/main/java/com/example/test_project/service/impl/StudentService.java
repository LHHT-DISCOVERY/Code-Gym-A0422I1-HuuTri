package com.example.test_project.service.impl;

import com.example.test_project.model.Student;
import com.example.test_project.repository.IStudentRepository;
import com.example.test_project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository iStudentRepository ;

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
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
}
