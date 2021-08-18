package com.company;

public class Fruit extends Product {
    private String fruitType;
    private String fruitColor;

    public Fruit (String fruitType, String fruitColor, double price, int howMany, int aisle) {
        super(price, howMany, aisle );
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
    }


    public String toString() {
        return fruitType + " are " + fruitColor + " and we have " + howMany + " in stock. The price per pound $" +
                price + " and we have sold " + " pounds. They have been in stock for " +
                " days. Are they prepared ? "+ ". Located in aisle: " + aisleNum;
    }

}
