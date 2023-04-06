package com.pragra.pizzaStorePractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<PizzaStore> orderNumber = new ArrayList<PizzaStore>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("----------------------------Pizza Store------------------------------" +
                    "\nWhat would you like to order?" +
                    "\n1. Veg Pizza" +
                    "\n2. MeatLovers Pizza" +
                    "\n3. Cheese Pizza" +
                    "\n4. Garlic Bread" +
                    "\n5. Becks Beer" +
                    "\n0. Exit" +
                    "\n---------------------------------------------------------------------" +
                    "\nEnter your choice to add to cart: ");
            int userInput = sc.nextInt();
            if (userInput == 0) {
                break;
            } else if (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5) {
                System.out.println("Invalid entry. Please try again and enter one of 1, 2, 3, 4, 5 or 0!");
                continue;
            }
            PizzaStore pizzaStore = null;
            switch (userInput) {
                case 1:
                    orderNumber.add(new VegPizza());
                    break;
                case 2:
                    orderNumber.add(new MeatLoversPizza());
                    break;
                case 3:
                    orderNumber.add(new CheesePizza());
                    break;
                case 4:
                    orderNumber.add(new GarlicBread());
                    break;
                case 5:
                    orderNumber.add(new BecksBeer());
                    break;
            }

        }
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < orderNumber.size(); i++) {
            System.out.println(orderNumber.get(i));
        }
        double totalPrice = 0;
        int totalCalories = 0;
        for (int j = 0; j < orderNumber.size(); j++) {
            totalPrice += orderNumber.get(j).getItemPrice();
            totalCalories += orderNumber.get(j).getItemCalories();
        }
        System.out.println("---------------------------------------------------------------------" +
                "\nTotal: $" + totalPrice + "\nTotal Calories: " + totalCalories + "cal\n" +
                "---------------------------------------------------------------------");

    }
}
