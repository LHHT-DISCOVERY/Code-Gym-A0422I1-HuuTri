package com.example.furama_managerment.service.employee_service;

import com.example.furama_managerment.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IEmployeeService {

    Page<Employee> findAllPage(Pageable pageable);

    void createOrUpdate(Employee employee);

    void deleteById(int id);

    Page<Employee> findEmployeeByName(String name , Pageable pageable );

}
