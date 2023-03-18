package com.practice;

/*
    1
    1
    2
    3
    5
    8
    13
    21
 */

public class Exercise9 {
    public static void main(String[] args) {

        fibonacci();

    }

    public static void fibonacci() {
        int x = 0;
        System.out.println(x);
        int y = 1;
        System.out.println(y);
        for (int i = 1; i <= 7; i++) {
            int sum = x + y;
            System.out.println(sum);
            x = y;
            y = sum;
        }
    }
}
