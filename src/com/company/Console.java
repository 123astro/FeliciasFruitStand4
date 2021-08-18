package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Console {
    private String selection;
    private Scanner scanner = new Scanner(System.in);
    private Store store;

    public Console() {
       this.store = new Store();
    }

    public void getSelections(){
        System.out.println("Would you like to" +
                "\nadd ?       1 "+
                "\nsell ?      2" +
                "\nremove ?    3" +
                "\ninventory ? 4");
       int input = scanner.nextInt();
        switch (input) {
            case 1 -> this.add();
//            case 2 -> this.sell();
//            case 3 -> this.remove();
            case 4 -> this.store.displayProducts();
            default -> getSelections();
        }
    }

    public void add(){
        System.out.println("What would you like to add?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)){
            case "F":
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Fruit color?");
                String color = scanner.next();
                System.out.println("Price?");
                double price = scanner.nextDouble();
                System.out.println("How many?");
                int howMany = scanner.nextInt();
                System.out.println("Which aisle?");
                int aisle = scanner.nextInt();
                this.store.addFruit(type, color, price, howMany, aisle);
                break;
            case "M":
                System.out.println("Meat type?");
                String type2 = scanner.next();
                System.out.println("Organic?");
                String organic = scanner.next();
                System.out.println("Price?");
                double price2 = scanner.nextDouble();
                System.out.println("How many?");
                int howMany2 = scanner.nextInt();
                System.out.println("Which aisle?");
                int aisle2 = scanner.nextInt();
                this.store.addMeat(type2, organic, price2, howMany2, aisle2);
                break;
            default:
                add();
        }
    }

}






