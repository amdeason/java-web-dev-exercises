package org.launchcode.java.studios.restaurant;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        MenuItem x = new MenuItem("test");
        System.out.println(x.getDateAdded());
        LocalDate y = x.getDateAdded();

        y.getMonthValue();
    }
}
