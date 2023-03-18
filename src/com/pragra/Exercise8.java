package com.practice;

public class Exercise8 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++; // 5 + 7 + 7
        System.out.println(y); // 19
        System.out.println(x); // 8
    }
}
