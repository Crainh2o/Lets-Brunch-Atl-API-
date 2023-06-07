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
    private String menu_URL;

    @OneToMany(mappedBy = "menu")
    @JsonIgnore
    private List<BrunchPlaces> brunchPlacesList;

    public String getMenu_URL() {
        return menu_URL;
    }

    public void setMenu_URL(String menu_URL) {
        this.menu_URL = menu_URL;
    }

    public List<BrunchPlaces> getBrunchPlacesList() {
        return brunchPlacesList;
    }

    public void setBrunchPlacesList(List<BrunchPlaces> brunchPlacesList) {
        this.brunchPlacesList = brunchPlacesList;
    }

    public Menu(Long id, Double price, String menu_URL) {
        this.id = id;
        this.price = price;
        this.menu_URL = menu_URL;
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



    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", price=" + price +
                ", menu_URL='" + menu_URL + '\'' +
                '}';
    }
}

