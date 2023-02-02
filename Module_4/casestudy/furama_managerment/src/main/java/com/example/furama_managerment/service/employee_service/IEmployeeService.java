package com.example.furama_managerment.service.employee_service;

import com.example.furama_managerment.model.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEmployeeService {

    void createOrUpdate(Employee employee);

    List<Employee> findAll();

}
