package com.example.test_project.service;

import com.example.test_project.model.Classes;

import java.util.List;

public interface IClassService {
    List<Classes> findAll();
    Classes createOrUpdate(Classes classes);
    void deleteById(int id);

}
