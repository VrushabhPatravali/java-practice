package com.pragra;

public class Exercise26 {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <=19) {
            return true;
        } else {
            return false;
        }
    }
}
