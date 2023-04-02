package com.pragra.stringsPractice;
//for debugging
public class StringPractice {
    public static void main(String[] args) {
        String s1 = "hello"; //string pool
        s1 = "vehicle";
        String s2 = new String("hello"); //new object created in heap
        s2 = "car";
        StringBuffer s3 = new StringBuffer("hello"); //multithreaded operations/thread-safe/used to avoid data corruption or inconsistencies
        StringBuilder s4 = new StringBuilder("hello"); //single threaded operations/not thread-safe
    }
}
