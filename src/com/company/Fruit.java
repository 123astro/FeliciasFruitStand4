package com.company;

public class Fruit extends Product {
    private String fruitColor;

    public Fruit (String type, String brand, String fruitColor,  double price, int aisle) {
        super(type, brand, price, aisle);
        this.fruitColor = fruitColor;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", aisleNum=" + aisleNum +
                ", fruitColor='" + fruitColor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
