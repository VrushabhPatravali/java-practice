package com.pragra.encapsulationPractice;

// initializing school as a constant in all objects
public class Student1 {
    private final String school;
    private int age;
    private int marks;

    public Student1(int age, int marks) {
        this(age);
        this.marks = marks;
    }

    public Student1(int age) {
        this.school = "pragra";
        this.age = age;
    }

    public Student1() {
        super();
        this.school = "pragra";
    }
    
}
