package org.launchcode.java.studios.restaurant;

import java.time.*;
import java.util.ArrayList;
public class Menu {
    private String season;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(String season) {
        this.season = season;
        this.lastUpdated = LocalDate.now();
        this.menuItems = new ArrayList<MenuItem>();
    }
    public Menu(String season, LocalDate lastUpdated) {
        this.season = season;
        this.lastUpdated = lastUpdated;
        this.menuItems = new ArrayList<MenuItem>();
    }
    public Menu(String season, LocalDate lastUpdated, ArrayList<MenuItem> menuItems){
        this.season = season;
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }
}
