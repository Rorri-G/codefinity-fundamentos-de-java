package com.example;

public class Main {
    public static double calculateAverage(int[] workHours) {
        int sizeMassive = workHours.length;
         double totalHours = 0;

        for (int i=0; i<sizeMassive; i++) {
            totalHours += workHours[i];
        }

        return totalHours/sizeMassive;
    }
    
    public static void main(String[] args) {
        int[] workHours = {7, 8, 6, 9, 7, 7, 8, 7, 6, 9};
        double average = calculateAverage(workHours);

        if (average < 8) {
            System.out.println("Penalty: employee worked " + average + " hours on average.");
        } else {
            System.out.println("Good job! Employee worked " + average + " on average.");
        }
    }
}
