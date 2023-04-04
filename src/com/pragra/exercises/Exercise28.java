package com.pragra.exercises;

public class Exercise28 {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(71));
        System.out.println(convertToCentimeters(5, 11));
    }

    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeters = (heightInInches * 2.54);
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int convertedHeightInFeet = heightInFeet * 12;
        int heightInInches = convertedHeightInFeet + remainingHeightInInches;
        double heightInCentimeters = convertToCentimeters(heightInInches);
        return heightInCentimeters;
    }
}
