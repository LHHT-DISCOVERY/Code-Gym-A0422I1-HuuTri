package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {

    @Id
    private int id;
    private String name ;
    private String author;
    private String typeMusic;
    private String link ;

    public Music() {
    }

    public Music(int id, String name, String author, String typeMusic, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.typeMusic = typeMusic;
        this.link = link;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
