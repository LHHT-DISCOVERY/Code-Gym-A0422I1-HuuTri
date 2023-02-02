package com.example.furama_managerment.repository.employee_repository;

import com.example.furama_managerment.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position , Integer> {
}
