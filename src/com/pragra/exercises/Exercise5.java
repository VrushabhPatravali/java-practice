package com.pragra.exercises;

public class Exercise5 {

    int a = 1;
    static int x = 3;

    public static void main(String[] args) {
        System.out.println(x);
        x = 5;
        new Exercise5().main1();
        String h;
        final double PI = 3.14;

    }

    public void main1() {
        a = 2;
        System.out.println(a);
        System.out.println(x);
    }
}
