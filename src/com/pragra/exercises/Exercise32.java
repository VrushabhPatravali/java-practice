package com.pragra.exercises;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 37));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (temperature >= 25 && temperature <= 45) {
            if (summer) {
                return true;
            } else {
                return (temperature <= 35);
            }
        }
        return false;

    }
}
