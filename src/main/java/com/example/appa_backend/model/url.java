package com.example.appa_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "links")
public class url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "link", nullable = false)
    private String link;

    public url(int id, String link) {
        this.id = id;
        this.link = link;
    }

    public url() {    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
