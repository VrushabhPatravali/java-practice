package com.pragra.exercises;

public class Exercise2 {
    public static void main(String[] args) {
        double doubleVariable = 20.00;
        double secondDoubleVariable = 80.00;
        double result = (doubleVariable + secondDoubleVariable) * 100;
        double remainder = result % 40.00;
        boolean b = (remainder == 0.00) ? true : false;
        System.out.println(b);
        if (!b) {
            System.out.println("got some remainder");
        }
    }
}
