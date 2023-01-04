package com.example.restful_api_blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Category {
    @Id
    private int idBlog;
    private String nameBlog;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
//    phải có @JsonIgnore mới get ra cho webservicec được
    @JsonIgnore
    private Set<Blog> blog;

    public Category() {
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public Set<Blog> getBlog() {
        return blog;
    }

    public void setBlog(Set<Blog> blog) {
        this.blog = blog;
    }
}
