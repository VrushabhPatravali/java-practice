package com.pragra;

public class Exercise10 {

    public static void main(String[] args) {

        fibonacciPyramid();
    }

    public static void fibonacciPyramid() {
        System.out.print(0);
        System.out.println();
        System.out.print(0);
        System.out.println(1);
        for (int j = 1; j <= 7; j++) {
            System.out.print(0);
            System.out.print(1);
            int x = 0;
            int y = 1;
            for (int i = 1; i <= j; i++) {
                int sum = x + y;
                System.out.print(sum);
                x = y;
                y = sum;
            }
            System.out.println();
        }
    }
}

