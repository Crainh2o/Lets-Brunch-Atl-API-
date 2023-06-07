package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column
    private Long id;

    @Column
    private Double price;

    @Column
    private String name;

    @OneToMany(mappedBy = "menu")
    @JsonIgnore
    private List<BrunchPlaces> brunchPlacesList;


    public void setName(String name) {
        this.name = name;
    }

    public Menu(Long id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Menu() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMenu_URL() {
        return name;
    }

    public void setMenu_URL(String menu_URL) {
        this.name = menu_URL;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", price=" + price +
                ", menu_URL='" + name + '\'' +
                '}';
    }
}

