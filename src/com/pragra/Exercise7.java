package com.pragra;

public class Exercise7 {
 
    public static void main(String[] args) {
        int sum = sum(3, 4);
        int difference = diff(4, 3);
        int product = prod(3, 4);
        int division = div(6, 2);
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(division);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
