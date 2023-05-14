package com.example.demo.model.customer;

import com.example.demo.model.account.Account;
import com.example.demo.model.ticket.Ticket;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;
@Getter
@Setter
@Entity
public class Customer {
    @Id
    @Column(columnDefinition = ("varchar(45)"))
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.example.demo.model.customer.MyGenerator")
    private String id;
    @NotNull
    private String fullName;
    @NotNull
    private Boolean gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date birthday;
    @NotNull
    private String email;
    @NotNull
    @Column(columnDefinition = ("varchar(15)"))
    private String phoneNumber;
    @NotNull
    private String address;
    @NotNull
    private String cardId;

    @OneToOne
    @JoinColumn(name = "username")
    @NotNull
    private Account account;

    private Boolean isDelete;

    public Customer() {
    }

    public Customer(String id, @NotNull String fullName, @NotNull Boolean gender, @NotNull Date birthday,
                    @NotNull String email, @NotNull String phoneNumber, @NotNull String address,
                    @NotNull String cardId,
                    @NotNull Account account, Boolean isDelete) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cardId = cardId;
        this.account = account;
        this.isDelete = isDelete;
    }

    public Customer(String fullName, Boolean gender, Date birthday, String email, String phoneNumber,
                    String address, String cardId, Account account, Boolean isDelete) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cardId = cardId;
        this.account = account;
        this.isDelete = isDelete;
    }

    public Customer(String id, String fullName, Boolean gender, Date birthday, String email, String phoneNumber, String address, String cardId) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cardId = cardId;
    }
}
