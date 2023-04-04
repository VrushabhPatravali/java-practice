package com.pragra.exercises;

/*
 *     4
 * *    3
 * * *   2
 * * * *  1
 * * * * * 0
 */

public class Exercise11 {
    public static void main(String[] args) {
        starPyramid(7);
    }

    public static void starPyramid(int x) {
        x = 7;
        for (int i = x; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = x; j >= i; j--) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
