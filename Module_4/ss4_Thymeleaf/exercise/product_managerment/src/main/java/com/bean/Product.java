package com.bean;

public class Product {
    private Integer id ;
    private String name ;
    private Double price ;
    private String  description;
    private String manufacturers;

    public Product() {
    }

    public Product(Integer id, String name, Double price, String description, String manufacturers) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturers = manufacturers;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }
}
