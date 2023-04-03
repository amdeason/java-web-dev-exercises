package org.launchcode.java.exercises;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double gallons;
        double miles;
        double mpg;

        System.out.println("Enter gallons consumed:");
        gallons = input.nextDouble();
        System.out.println("Enter miles driven:");
        miles = input.nextDouble();
        input.close();
        mpg = miles / gallons;
        System.out.format("MPG is: %f", mpg);
    }
}
