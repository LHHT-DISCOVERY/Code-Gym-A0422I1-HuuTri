package com.example.ajax_blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBlog;
    private String nameBlog;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
//     có để thực hiện webservice
    @JsonIgnore
    Set<Blog> blog;

    public Category() {
    }

    public Set<Blog> getBlogs() {
        return blog;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blog = blogs;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public Set<Blog> getBlog() {
        return blog;
    }
}
