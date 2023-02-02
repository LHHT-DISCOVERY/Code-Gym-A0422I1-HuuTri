package com.example.test_project.repository;

import com.example.test_project.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassRepository extends JpaRepository<Classes, Integer> {

}
