package com.spring.spring_project.Model.Dto;

import java.math.BigDecimal;

public class Item {
    private long id;
    private String name;
    private String description;
    private double price;
    private String category;

    public Item(String name, String description, double price, String category) {
        this.id++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Item() {

    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Item setCategory(String category) {
        this.category = category;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Item setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }
}
