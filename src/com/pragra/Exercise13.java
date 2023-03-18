package com.pragra;

public class Exercise13 {
    public static void main(String[] args) {
        continueTest();
    }

    public static void continueTest() {

        for(int i = 1; i<=10; i++){
            System.out.println("start " + i);

            if(i==5) {
                continue;
            }

            System.out.println("stop " + i);
        }
    }
}
