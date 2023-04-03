package com.pragra.classesAndObjects;

public class StaticInstanceCounter {

    static int count = 0;
    int instanceCount;

    public static void main(String[] args) {

        StaticInstanceCounter counter1 = new StaticInstanceCounter();
        StaticInstanceCounter counter2 = new StaticInstanceCounter();

        counter1.printCounts();
        counter2.printCounts();

        counter1.incrementCounts();
        counter2.incrementCounts();

        counter1.printCounts();
        counter2.printCounts();

        counter1.incrementCounts();
        counter2.incrementCounts();

        counter1.printCounts();
        counter2.printCounts();
    }
// instance variables cannot be referenced from static methods
//    static void incrementCount() {
//        count++;
//    }
//    static void printCount() {
//        System.out.println(count);
//    }

    void incrementCounts() {
        this.instanceCount++;
        count++;
    }
    void printCounts() {
        System.out.println(this.instanceCount);
        System.out.println(count);
    }
}
