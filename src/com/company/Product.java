package com.company;

public class Product {
    protected double price;
    protected int howMany;
    protected int aisleNum;

    public Product(double price, int howMany, int aisleNum){
        this.price = price;
        this.howMany = howMany;
        this.aisleNum = aisleNum;
    }
    public String toString(){
        return "{ price per pound: " + price + " pounds sold: " + " Number of days in stock: " + " Quantity of stock; " + howMany + " Is the food prepared: " +
                " Location aisle number: " + aisleNum;
    }
}
