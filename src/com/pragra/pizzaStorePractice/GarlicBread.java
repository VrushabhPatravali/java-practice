package com.pragra.pizzaStorePractice;

public class GarlicBread implements PizzaStore{

    double itemPrice = 10;
    int itemCalories = 150;
    String itemDescription = "Garlic and Mozzarella Cheese Bread";
    String itemName = "Garlic Bread";

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
        return "GarlicBread{" +
                "itemPrice=" + itemPrice +
                ", itemCalories=" + itemCalories +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
