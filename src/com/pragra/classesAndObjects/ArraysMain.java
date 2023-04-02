package com.pragra.classesAndObjects;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        ArraysPractice1 arraysPractice = new ArraysPractice1();
        System.out.println(arraysPractice.marks()); // new object is created in the method every time hence the different reference hashcode
        System.out.println(arraysPractice.marks());
        String s1 = "This is a sentence.";
        String[] splitSentence = s1.split(" ");
        System.out.println(Arrays.toString(splitSentence));
    }
}
