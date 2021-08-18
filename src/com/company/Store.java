package com.company;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {
    private long storeBalance = 0;
    //public HashMap<String, Integer> goods = new HashMap<>();
    List<Product> feliciasProducts = new ArrayList<>();

    public Store(){
    }

    public void addMeat(String meatType, String organic , double price, int qtyInStock, int aisleNum){
        feliciasProducts.add((( new Meat( meatType, organic , price,qtyInStock, aisleNum))));

    }
    public void addFruit(String fruitType, String fruitColor , double price, int qtyInStock, int aisleNum){
        feliciasProducts.add((( new Fruit( fruitType, fruitColor , price,qtyInStock, aisleNum))));

    }
    public void displayProducts() {
        for (Product product : feliciasProducts) {
            System.out.println(product);
        }
    }

    public void sellProducts(String product){

        }


    public void throwAwayProducts(String product){


        }



}
