package com.example.furama_managerment.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name= "user_name" , columnDefinition = "varchar(255)")
    private String userName;

    @Column(name= "pass_word" , columnDefinition = "varchar(255)")
    private String passWord;

    @OneToMany(mappedBy = "user")
    Set<Employee> employees;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}