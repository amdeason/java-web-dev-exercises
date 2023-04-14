package org.launchcode.java.studios.restaurant;

import java.time.*;
import java.util.ArrayList;
public class Menu {
    private String season;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems;

    /*
    CONSTRUCTORS
     */
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

    public Menu(String season, LocalDate lastUpdated, ArrayList<MenuItem> menuItems) {
        this.season = season;
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    /*
    GETTERS
     */
    public String getSeason() {
        return season;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    /*
    SETTERS
     */
    public void setSeason(String season) {
        this.season = season;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}