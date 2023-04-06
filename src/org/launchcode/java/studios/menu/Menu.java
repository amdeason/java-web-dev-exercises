package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String season;
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(String season) {
        this.season = season;
    }
    public Menu(String season, Date lastUpdated) {
        this.season = season;
        this.lastUpdated = lastUpdated;
    }
    public Menu(String season, Date lastUpdated, ArrayList<MenuItem> menuItems){
        this.season = season;
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

}
