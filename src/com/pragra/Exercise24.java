package com.pragra;

public class Exercise24 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(5.2348, -5.2347));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstConvertedNumber = Math.abs((int) (firstNumber * 1000));
        int secondConvertedNumber = Math.abs((int) (secondNumber * 1000));

        if (firstConvertedNumber == secondConvertedNumber) {
            return true;
        } else {
            return false;
        }
    }
}
