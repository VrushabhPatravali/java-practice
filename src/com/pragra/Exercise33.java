package com.pragra;

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n0. Exit\nEnter the operation you would like to perform: ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            if (userInput == 0) {
                break;
            } else if (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5) {
                continue;
            }
            System.out.println("Please enter the first number: ");
            double x = sc.nextDouble();
            System.out.println("Please enter the second number: ");
            double y = sc.nextDouble();
            switch (userInput) {
                case 1 -> System.out.println(addition(x, y));
                case 2 -> System.out.println(subtraction(x, y));
                case 3 -> System.out.println(multiplication(x, y));
                case 4 -> System.out.println(division(x, y));
                case 5 -> System.out.println(modulus(x, y));
            }
        }
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

}
