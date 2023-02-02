package com.example.furama_managerment.repository.employee_repository;

import com.example.furama_managerment.model.employee.EducationDegree;
import com.example.furama_managerment.service.imp.EducationDegreeService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree , Integer> {
}
