package com.pragra.abstractionPolymorphismPractice;

public abstract class Vehicle {
    //abstract classes are not 100% abstract as member/instance variables and concrete/instance methods can be declared
    //abstract classes can have constructors
    public abstract int numberOfTires();

    public abstract void displayMessage();
}
