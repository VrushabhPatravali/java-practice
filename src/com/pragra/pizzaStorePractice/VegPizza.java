package com.pragra.pizzaStorePractice;

public class VegPizza implements PizzaStore{

    double itemPrice = 20;
    int itemCalories = 250;
    String itemDescription = "Green Pepper, Onion and Tomato Pizza";
    String itemName = "Vegetable Pizza";

    public double getItemPrice() {
        return itemPrice;
    }
    public int getItemCalories() {
        return itemCalories;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "VegPizza{" +
                "itemPrice=" + itemPrice +
                ", itemCalories=" + itemCalories +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
