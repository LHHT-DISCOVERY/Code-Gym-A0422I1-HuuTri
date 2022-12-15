package com.example.blog_applycation.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    // ID tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String content;

    @ManyToOne
    @JoinColumn(name = "idBlog", referencedColumnName = "idBlog")
    private Category idBlog;


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

    public Category getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Category idBlog) {
        this.idBlog = idBlog;
    }
}
