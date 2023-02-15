package com.example.test_project.service.impl;

import com.example.test_project.model.Classes;
import com.example.test_project.repository.IClassRepository;
import com.example.test_project.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {
    @Autowired
    IClassRepository iClassRepository;


    @Override
    public List<Classes> findAll() {
        return iClassRepository.findAll();
    }

    @Override
    public Classes createOrUpdate(Classes classes) {
        return iClassRepository.save(classes);
    }

    @Override
    public void deleteById(int id) {
        iClassRepository.deleteById(id);
    }

    @Override
    public Classes findById(int id) {
        return iClassRepository.findById(id).orElse(null);
    }
}
