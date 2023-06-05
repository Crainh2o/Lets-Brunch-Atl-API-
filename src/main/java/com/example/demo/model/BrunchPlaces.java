package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "brunchplaces")
public class BrunchPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String review;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    @JsonIgnore
    private Menu menu;

    public BrunchPlaces() {
    }

    public BrunchPlaces(Long id, String name, String address, String review) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getReview() {
        return review;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
