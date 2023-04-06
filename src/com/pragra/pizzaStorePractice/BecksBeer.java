package com.pragra.pizzaStorePractice;

public class BecksBeer implements PizzaStore{

    double itemPrice = 5;
    int itemCalories = 100;
    String itemDescription = "Beck's German Beer 5% 500mL";
    String itemName = "Beck's Beer";
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
        return "BecksBeer{" +
                "itemPrice=" + itemPrice +
                ", itemCalories=" + itemCalories +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
