package com.pragra;

public class Exercise27 {
    public static void main(String[] args) {
    test(5);
    test((short) 5);
    test(7L);
    }

    public static void test(int score) {}
    public static void test(short score) {}
    public static void test(long score) {}

}
