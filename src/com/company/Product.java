package com.company;

public abstract class Product {
    protected double price;
    protected int aisleNum;
    protected String type;
    protected String brand;
    protected int qty;



    public Product(String type, String brand, double price, int aisleNum, int qty){
        this.price = price;
        this.aisleNum = aisleNum;
        this.type = type;
        this.brand = brand;
        this.qty = qty;
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
    public int getQty(){
        return qty;
    }

    public void setQty(int qty) {
        if(qty >  0 )
        this.qty = qty;
    }

//    public String toString(){
//        return "{ price per pound: " + price + " pounds sold: " + " Number of days in stock: " + " Quantity of stock; "  + " Is the food prepared: " +
//                " Location aisle number: " + aisleNum;
//    }


}
