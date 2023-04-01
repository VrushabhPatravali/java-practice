package com.pragra.classesAndObjects;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 50, 60, 80);
        Student student2 = new Student("John", 90, 70, 50);
        Student student3 = new Student("Peter", 50, 80, 10);

        System.out.println(student1.studentName + " scored " + student1.totalPercentage() + "%");
        System.out.println(student2.studentName + " scored " + student2.totalPercentage() + "%");
        System.out.println(student3.studentName + " scored " + student3.totalPercentage() + "%");
        System.out.println(student1.phoneNumber);

    }
}
