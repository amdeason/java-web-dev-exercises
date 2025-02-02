package org.launchcode.java.studios.menu;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;
    private boolean isNew;

    public MenuItem(String name) {
        this.name = name;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
