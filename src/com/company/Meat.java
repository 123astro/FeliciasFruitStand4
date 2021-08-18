package com.company;
class Meat extends Product{
    private String meatType;
    private String organic;

    public Meat (String meatType, String organic , double price, int howMany, int aisleNum) {
        super(price, howMany, aisleNum);
        this.meatType = meatType;
        this.organic = organic;
    }

    public String toString() {
        return meatType + " is our meat type. Is it organic? " + organic + ". The price per pound is $" + price +
                ". We have sold " +  " pounds. It has been in stock for "+ " days. We have "
                + howMany + " in stock.\n" + "Is the meat prepared? " + ". Located in aisle number: " + aisleNum + ".";
    }
}
