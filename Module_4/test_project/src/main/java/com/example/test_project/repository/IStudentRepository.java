package com.example.test_project.repository;

import com.example.test_project.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    @Query("select e from Student  e where e.name like %:name%")
    Page<Student> findName(@Param("name") String name  , Pageable pageable);
}
