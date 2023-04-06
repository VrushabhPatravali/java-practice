package com.pragra.interfacePractice;

public interface Work {

    //before java 1.8 interfaces were 100% abstract with no default methods
    //all these can be achieved, interfaces can not have constructors
    //variables are public static final by default
    int a = 10;

    void work();

    static void display() {
        System.out.println("interface work");
    }

    //default methods can only be made since java 1.8
    default void play() {
        System.out.println("working and playing");
    }

    class abc {}

    interface xyz {}

}
