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
        int itemCount1 = 0, itemCount2 = 0, itemCount3 = 0 , itemCount4 = 0, itemCount5 = 0;
        for (int i = 0; i < orderNumber.size(); i++) {
            System.out.println(orderNumber.get(i));
            if (orderNumber.get(i) instanceof VegPizza) {
                itemCount1++;
            } else if (orderNumber.get(i) instanceof MeatLoversPizza) {
                itemCount2++;
            } else if (orderNumber.get(i) instanceof CheesePizza) {
                itemCount3++;
            } else if (orderNumber.get(i) instanceof GarlicBread) {
                itemCount4++;
            } else if (orderNumber.get(i) instanceof BecksBeer) {
                itemCount5++;
            }

        }

        double totalPrice = 0;
        int totalCalories = 0;
        for (int j = 0; j < orderNumber.size(); j++) {
            totalPrice += orderNumber.get(j).getItemPrice();
            totalCalories += orderNumber.get(j).getItemCalories();
        }
        System.out.println("---------------------------------------------------------------------" +
                "\nYou ordered: " + itemCountPrint(itemCount1, itemCount2, itemCount3, itemCount4, itemCount5) +
                "\nTotal: $" + totalPrice + "\nTotal Calories: " + totalCalories + "cal\n" +
                "---------------------------------------------------------------------");

    }

    public static String itemCountPrint(int itemCount1, int itemCount2, int itemCount3, int itemCount4, int itemCount5) {
        String count = "";
        if (itemCount1 != 0) {
            count = count.concat(itemCount1 + " Veg Pizza ");
        }
        if (itemCount2 != 0) {
            count = count.concat(itemCount2 + " MeatLovers Pizza ");
        }
        if (itemCount3 != 0) {
            count = count.concat(itemCount3 + " Cheese Pizza ");
        }
        if (itemCount4 != 0) {
            count = count.concat(itemCount4 + " Garlic Bread ");
        }
        if (itemCount5 != 0) {
            count = count.concat(itemCount5 + " Beck's Beer ");
        }
        return count;
    }
}
