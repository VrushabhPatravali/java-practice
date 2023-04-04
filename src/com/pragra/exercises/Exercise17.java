package com.pragra.exercises;

public class Exercise17 {

    public static void main(String[] args) {
        System.out.println("main");
        main2();
        Exercise17.main2();
        new Exercise17().main3();
        new Exercise17().main3();
        Exercise17 obj = new Exercise17();
        obj.main3();
    }

    private static void main2() {
        System.out.println("2");
    }

    public void main3() {
        System.out.println("3");

    }

}

