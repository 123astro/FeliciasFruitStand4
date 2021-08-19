package com.company;
class Meat extends Product{
    private String organic;

    public Meat (String type, String brand, String organic, double price, int aisleNum) {
        super(type, brand, price, aisleNum);
        this.organic = organic;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", aisleNum=" + aisleNum +
                ", organic='" + organic + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
