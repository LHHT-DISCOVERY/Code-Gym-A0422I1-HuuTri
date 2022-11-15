package model;

public class Product {
     private int id;
     private String name;
     private double price;
     private String productType;
     private String productDescription;

    public Product(int id, String name, double price, String productType, String productDescription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.productDescription = productDescription;
    }

    public Product(String name, double price, String productType, String productDescription) {
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.productDescription = productDescription;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
