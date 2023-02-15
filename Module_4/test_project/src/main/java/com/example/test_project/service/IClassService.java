package com.example.test_project.service;

import com.example.test_project.model.Classes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClassService {
    List<Classes> findAll();
    Classes createOrUpdate(Classes classes);
    void deleteById(int id);

    Classes findById(int id);

}
