package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};

        for (int number : array) {
            System.out.format("%d\n", number);
            if (number % 2 != 0) {
                System.out.format("%d\n", number);
            }
        }
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.format("%d\n", number);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] s = sentence.split(" ");
        System.out.println(Arrays.toString(s));
    }
}
