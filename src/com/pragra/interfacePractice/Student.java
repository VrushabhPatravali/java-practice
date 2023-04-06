package com.pragra.interfacePractice;

public class Student extends Teacher implements Work, Study{

    @Override
    public void work() {
        System.out.println("working");
    }

    @Override
    public void study() {
        System.out.println("studying");
    }

    //if this class is implementing multiple interfaces with same default method signatures, we have to select the default method to be implemented
    @Override
    public void play() {
        Work.super.play();
    }
}