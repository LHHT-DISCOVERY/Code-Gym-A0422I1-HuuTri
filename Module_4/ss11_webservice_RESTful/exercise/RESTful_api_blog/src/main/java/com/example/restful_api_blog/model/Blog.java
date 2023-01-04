package com.example.restful_api_blog.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    private int id;
    private String name;
    private String content;

    @ManyToOne
    @JoinColumn(name = "idBlog", referencedColumnName = "idBlog")
    private Category category;

    public Blog() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
