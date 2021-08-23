package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Store {
    private double storeBalance;
    public List<Product> feliciasProducts = new ArrayList<>();

    public Store() {
        this.storeBalance = 10_000;
    }

    public double getStoreBalance() {
        System.out.println(storeBalance);
        return storeBalance;
    }

    public void addMeat(String meatType, String brand, String organic, double price, int aisleNum,
                        int qty, double cost) {
        feliciasProducts.add(((new Meat(meatType, brand, organic, price, aisleNum, qty))));
        storeBalance -= (cost * qty);
        System.out.println(storeBalance);
    }

    public void addFruit(String fruitType, String brand, String fruitColor, double price, int aisleNum,
                         int qty,  double cost) {
        feliciasProducts.add(((new Fruit(fruitType, brand, fruitColor, price, aisleNum, qty))));
        storeBalance -= (cost * qty);
        System.out.println(storeBalance);
    }


    public void checkAndAddFruitType(String type, String brand, String color, double price, int aisle, int qty1,
                                   double cost){
        for (int i = 0; i < feliciasProducts.size(); i++)
            if(Objects.equals(type, feliciasProducts.get(i).type)) {
                if (Objects.equals(brand, feliciasProducts.get(i).brand)) {
                    feliciasProducts.get(i).setQty(feliciasProducts.get(i).getQty() + qty1);
                    storeBalance -= (cost * qty1);
                    return;
                }
            }
       addFruit(type, brand, color, price, aisle, qty1, cost);
    }
    public void checkAndAddMeatType(String type2, String brand2, String organic, double price2, int aisle2, int qty2 ,
                                    double cost){
        for (int i = 0; i < feliciasProducts.size(); i++)
            if(Objects.equals(type2, feliciasProducts.get(i).type)) {
                if (Objects.equals(brand2, feliciasProducts.get(i).brand)) {
                    feliciasProducts.get(i).setQty(feliciasProducts.get(i).getQty() + qty2);
                    storeBalance -= (cost * qty2);
                    return;
                }
            }
        addMeat(type2, brand2, organic, price2, aisle2, qty2, cost);
    }

    public void displayProducts() {
        for (Product product : feliciasProducts) {
            System.out.println(product.type.toUpperCase(Locale.ROOT) + " " + product.brand.toUpperCase(Locale.ROOT) + " " + "Qty: " + product.qty );
        }
    }


    public void displayFruitProductNames() {
        for (Product product : feliciasProducts) {
            if (product.getClass().getSimpleName().equalsIgnoreCase("fruit"))
                System.out.println(product.type.toUpperCase(Locale.ROOT) + " " + product.brand.toUpperCase(Locale.ROOT));
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





