package com.pragra.constructorPractice;

public class Student2 {
    private static final String school = "pragra";
    private int age;
    private int marks;

    // getters and setters
    public int getAge() {
        return this.age;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setAge() {
        this.age = age;
    }

    public void setMarks() {
        this.marks = marks;
    }

    //constructors
    public Student2(int age, int marks) {
        this(age);
        this.marks = marks;
    }

    public Student2(int age) {
        this.age = age;
    }

    public Student2() {
        super();
    }

}

