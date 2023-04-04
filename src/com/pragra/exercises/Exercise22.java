package com.pragra.exercises;

public class Exercise22 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else {
            if (hourOfDay < 0 || hourOfDay > 23 || (hourOfDay >= 8 && hourOfDay <= 22)) {
                return false;
            } else {
                return true;
            }
        }
    }
}
