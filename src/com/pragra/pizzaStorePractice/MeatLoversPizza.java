package com.pragra.pizzaStorePractice;

public class MeatLoversPizza implements PizzaStore{


    double itemPrice = 25;
    int itemCalories = 300;
    String itemDescription = "Pepperoni Pizza";
    String itemName = "MeatLovers Pizza";
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
        return "MeatLoversPizza{" +
                "itemPrice=" + itemPrice +
                ", itemCalories=" + itemCalories +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
