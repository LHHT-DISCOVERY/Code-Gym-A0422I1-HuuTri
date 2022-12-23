package com.example.validate_form.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fist_name", columnDefinition = "varchar(45)")
    @Size(min = 5, max = 45, message = "{name.size}")
    @NotBlank(message = "{notempty}") // ko chấp nhận dấu cách
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar(45)")
    @Size(min = 5, max = 45)
    @NotBlank(message = "{notempty}")
    private String lastName;
    @Column(name = "phone_number", columnDefinition = "varchar(12)")
    @NotBlank(message = "{notempty}") // not dùng cho kiểu số
    private String phoneNumber;
    @Min(18)
    @Max(100)
    @NotNull(message = "{notempty}")
    private int age;
    @Column(name = "email", columnDefinition = "varchar(45)")
    @NotBlank(message = "{notempty}")
    private String email;

    public User() {
    }

    public User(int id, String firstName, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
