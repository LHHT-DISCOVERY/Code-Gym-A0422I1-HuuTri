package com.example.furama_managerment.repository.employee_repository;

import com.example.furama_managerment.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee , Integer> {

}
