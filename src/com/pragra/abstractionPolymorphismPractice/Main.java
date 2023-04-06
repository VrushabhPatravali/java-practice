package com.pragra.abstractionPolymorphismPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = null;

        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("BMW")) {
            vehicle = new BMW();
        } else if (userInput.equalsIgnoreCase("Audi")) {
            vehicle = new Audi();
        } else if (userInput.equalsIgnoreCase("Mercedes")) {
            vehicle = new Mercedes();
        } else if (userInput.equalsIgnoreCase("Ducati")) {
            vehicle = new Ducati();
        }

//        assert vehicle != null;
        vehicle.displayMessage();
        System.out.println(vehicle.numberOfTires());

    }
}
