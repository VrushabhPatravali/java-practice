package com.pragra.inheritancePractice;

public class Parent {

    public static class Parent1 {
        private int d = 5;

        public int getD() {
            return d;
        }

    }

    //attributes
    int a;
    int b;
    private int c;

    //constructors

    public Parent(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public Parent(int a, int b) {
        this(a);
        this.b = b;
    }

    public Parent(int a) {
        this.a = a;
    }

    public Parent() {
        super();
    }

    //methods
    public static void speak() {
        System.out.println("Parent");
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }
}
