package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area;
        double radius = 0;

        while (radius < 1) {
            System.out.println("Enter a radius:");
            try {
                radius = input.nextDouble();
                if (radius < 1) {
                    System.out.println("Enter a positive number");
                }
            } catch(InputMismatchException e) {
                System.out.println("Not a valid number");
                input.nextLine();
            }
        }

        area = Circle.getArea(radius);
        System.out.format("Area: %f", area);
    }
}
