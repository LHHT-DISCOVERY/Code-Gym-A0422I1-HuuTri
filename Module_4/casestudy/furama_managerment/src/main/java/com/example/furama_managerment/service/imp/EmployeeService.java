package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.repository.employee_repository.IEmployeeRepository;
import com.example.furama_managerment.service.employee_service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository  iEmployeeRepository ;

    @Override
    public void createOrUpdate(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }
}
