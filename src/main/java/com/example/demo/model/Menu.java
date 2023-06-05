package com.example.demo.model;

import javax.persistence.*;

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


    public Menu(Long id, Double price, String menuUrl) {
        this.id = id;
        this.price = price;
        this.menu_URL = menuUrl;
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
        return menu_URL;
    }

    public void setMenu_URL(String menu_URL) {
        this.menu_URL = menu_URL;
    }
}

