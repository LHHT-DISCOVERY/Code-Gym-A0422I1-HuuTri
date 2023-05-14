package com.example.demo.model.account;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
@Getter
@Setter
@Entity
public class Account {
    @Id
    @Column(columnDefinition = ("varchar(45)"))
    private String username;
    @NotNull
    @Column(columnDefinition = ("varchar(255)"))
    private String password;
    @NotNull
    private Boolean isDelete;
    @NotNull
    private Boolean isEnable;
    @Column(columnDefinition = ("varchar(255)"))
    private String verification_code;

    public Account() {
    }

    public Account(String username, String password, Boolean isDelete, Boolean isEnable, String verification_code, Employee employees, Customer customer) {
        this.username = username;
        this.password = password;
        this.isDelete = isDelete;
        this.isEnable = isEnable;
        this.verification_code = verification_code;
    }
}
