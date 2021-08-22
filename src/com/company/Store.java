package com.company;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private double storeBalance;
    public List<Product> feliciasProducts = new ArrayList<>();

    public Store() {
        this.storeBalance = 10_000;
    }


    public void addMeat(String meatType, String brand, String organic, double price, int aisleNum,
                        int qty,  double cost) {
        feliciasProducts.add(((new Meat(meatType, brand, organic, price, aisleNum, qty))));
        storeBalance -= cost;
        System.out.println(storeBalance);
    }

    public void addFruit(String fruitType, String brand, String fruitColor, double price, int aisleNum,
                         int qty,  double cost) {
        feliciasProducts.add(((new Fruit(fruitType, brand, fruitColor, price, aisleNum, qty))));
        storeBalance -= cost;
        System.out.println(storeBalance);
    }


    public void displayProducts() {
        for (Product product : feliciasProducts) {
            System.out.println(product.type + " " + product.brand + " " + product.qty );
        }
    }


    public void displayFruitProductNames() {
        for (Product product : feliciasProducts) {
            if (product.getClass().getSimpleName().equalsIgnoreCase("fruit"))
                System.out.println(product.type + " " + product.brand);
        }
    }

    public void displayMeatProductNames() {
        for (Product product : feliciasProducts) {
            if (product.getClass().getSimpleName().equalsIgnoreCase("meat"))
                System.out.println(product.type + " " + product.brand);
        }
    }

    public void sellProduct(String type, String brand) {
        for (int i = 0; i < feliciasProducts.size(); i++) {

            if (feliciasProducts.get(i).getType().equalsIgnoreCase(type) && (feliciasProducts.get(i).getBrand().equalsIgnoreCase(brand))) {
                feliciasProducts.get(i).setQty(feliciasProducts.get(i).getQty() - 1);
                storeBalance += feliciasProducts.get(i).getPrice();
                System.out.println("Store Balance: " + storeBalance);;
                break;
            }

        }
    }

    public void removeProduct(String type, String brand) {
        for (int i = 0; i < feliciasProducts.size(); i++) {
            if (feliciasProducts.get(i).getType().equalsIgnoreCase(type) && (feliciasProducts.get(i).getBrand().equalsIgnoreCase(brand))) {
                feliciasProducts.remove(i);
                break;
            }

        }
    }

}





