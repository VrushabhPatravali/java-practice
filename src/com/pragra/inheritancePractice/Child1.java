package com.pragra.inheritancePractice;

public class Child1 extends Parent {

    //attributes
    int d;

//constructors

    public Child1(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;
    }

    public Child1(int a, int b, int c) {
        super(a, b, c);
    }

    public Child1(int a, int b) {
        super(a, b);
    }

    public Child1(int a) {
        super(a);
    }

    public Child1() {
        super();
    }

    //methods
    //if I add parameters and change the method signature, parent method will be executed even if it does not have the same signature entirely
    public static void speak(String a) {
        System.out.println("Child1");
    }
//    public static void speak() {
//        System.out.println("Child1");
//    }

    //displaying parent attribute
    public void displayA() {
        System.out.println(a);
    }
}
