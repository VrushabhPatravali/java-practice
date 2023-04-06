package com.pragra.interfacePractice;

public interface Study {

    default void play() {
        System.out.println("studying and playing");
    }
    void study();
}
