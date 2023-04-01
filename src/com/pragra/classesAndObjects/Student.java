package com.pragra.classesAndObjects;

public class Student {

    String studentName;
    String phoneNumber;
    int math, science, english;

    Student(String studentName, int math, int science, int english) {
        this.studentName = studentName;
        this.math = math;
        this.science = science;
        this.english = english;
    }
    int totalPercentage(){
        return ((this.math + this.science + this.english) / 3);
    }
}
