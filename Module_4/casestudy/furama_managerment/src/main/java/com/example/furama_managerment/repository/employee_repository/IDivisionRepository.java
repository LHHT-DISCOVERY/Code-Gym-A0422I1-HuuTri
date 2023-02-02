package com.example.furama_managerment.repository.employee_repository;

import com.example.furama_managerment.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
}
