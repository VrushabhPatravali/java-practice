package com.pragra.pizzaStorePractice;

public class CheesePizza implements PizzaStore{

    double itemPrice = 15;
    int itemCalories = 200;
    String itemDescription = "Mozzarella Cheese Pizza";
    String itemName = "Cheese Pizza";
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
        return "CheesePizza{" +
                "itemPrice=" + itemPrice +
                ", itemCalories=" + itemCalories +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
