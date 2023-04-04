package com.pragra.inheritancePractice;

public class Child1 extends Parent {

    int c;
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
