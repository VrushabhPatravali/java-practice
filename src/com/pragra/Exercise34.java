package com.pragra;

public class Exercise34 {
    /*
        static/static block precedence: static blocks are loaded into the memory at the
        time of class loading before the object creation and execution of the main() method
    */
    static {
    System.out.println("static1");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }

    static {
        System.out.println("static2");
    }

}
