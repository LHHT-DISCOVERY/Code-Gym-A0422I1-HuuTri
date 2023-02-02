package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer phoneNumber;
    private String email;
    @OneToMany(mappedBy = "questionType")
    @JsonBackReference
    private Set<QuestionContent> questionContent;

    public QuestionType() {
    }

    public QuestionType(Integer id, String name, Integer phoneNumber, String email, Set<QuestionContent> questionContent) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.questionContent = questionContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<QuestionContent> getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(Set<QuestionContent> questionContent) {
        this.questionContent = questionContent;
    }
}

