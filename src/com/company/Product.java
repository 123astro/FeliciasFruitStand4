package com.company;

public class Product {
    protected double price;
    protected int aisleNum;
    protected String type;
    protected String brand;

    public Product(String type, String brand, double price, int aisleNum){
        this.price = price;
        this.aisleNum = aisleNum;
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "{ price per pound: " + price + " pounds sold: " + " Number of days in stock: " + " Quantity of stock; "  + " Is the food prepared: " +
                " Location aisle number: " + aisleNum;
    }
}
