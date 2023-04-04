package com.pragra.inheritancePractice;

public class Parent {

    public static class Parent1 {
        private int d = 5;

        public int getD() {
            return d;
        }

    }

    int a;
    int b;
    private int c;
    public static void speak(){
        System.out.println("Parent");
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getC() {
        return c;
    }
}
