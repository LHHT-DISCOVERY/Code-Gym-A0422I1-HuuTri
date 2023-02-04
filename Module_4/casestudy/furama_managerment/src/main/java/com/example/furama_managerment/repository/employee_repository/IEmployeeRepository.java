package com.example.furama_managerment.repository.employee_repository;

import com.example.furama_managerment.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee , Integer> {

    @Query("select e from Employee  e where e.employeeName like %:name%")
    Page<Employee> findEmployeeByEmployeeName( @Param("name") String name  , Pageable pageable);

}
