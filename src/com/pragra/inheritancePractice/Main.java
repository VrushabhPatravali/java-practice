package com.pragra.inheritancePractice;

public class Main {
    public static void main(String[] args) {
        Parent.speak();
        Child1.speak();

        Child1 child1 = new Child1();
        child1.displayA();
        //creating object, setting value to private attribute of parent using encapsulation, getting it and displaying it
        child1.setC(7);
        System.out.println(child1.getC());

        child1.a = 2; // we can assign value to attribute in parent class because of default constructor calling - > super class constructor -> and so on

        Grandchild grandchild = new Grandchild();
        grandchild.setC(10);
        System.out.println(grandchild.getC());

        Parent.Parent1 parent1 = new Parent.Parent1();
        System.out.println(parent1.getD());
        Child2 child2 = new Child2();
        System.out.println(child2.getD());
    }
}
