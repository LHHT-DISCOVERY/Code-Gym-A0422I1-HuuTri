package com.model;

public class Employee {
    private String id;
    private String name;
    private  String contactNUmber;

    public Employee() {
    }

    public Employee(String id, String name, String contactNUmber) {
        this.id = id;
        this.name = name;
        this.contactNUmber = contactNUmber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNUmber() {
        return contactNUmber;
    }

    public void setContactNUmber(String contactNUmber) {
        this.contactNUmber = contactNUmber;
    }
}
