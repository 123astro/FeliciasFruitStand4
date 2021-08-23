package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);
    private Store store;


    public Console() {
        this.store = new Store();
    }

    public void getSelections() {

        System.out.println("\nWould you like to:" +
                "\nAdd ?           1 " +
                "\nSell ?          2" +
                "\nRemove ?        3" +
                "\nInventory ?     4" +
                "\nStore Balance ? 5");
        valid();
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1 -> this.add();
            case 2 -> this.sell();
            case 3 -> this.remove();
            case 4 -> this.store.displayProducts();
            case 5 -> this.store.getStoreBalance();
            default -> getSelections();
        }
    }

    public void valid(){
        while (!scanner.hasNextInt()) {
            System.out.println("Input needs to be one of the numbers above.");
            scanner.nextLine();
        }
    }

    public void add() {
        System.out.println("What would you like to add?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)) {
            case "F":
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Brand? example Chiquita, Del monte, Dole, Matson, Evans, Gebbers ");
                String brand = scanner.next();
                System.out.println("Fruit color?");
                String color = scanner.next();
                System.out.println("Price we sell for?");
                double price = scanner.nextDouble();
                System.out.println("Which aisle?");
                int aisle = scanner.nextInt();
                System.out.println("Quantity?");
                int qty1 = scanner.nextInt();
                this.store.checkAndAddFruitType(type, brand, color, price, aisle, qty1, (price * .5));
                break;
            case "M":
                System.out.println("Meat type?");
                String type2 = scanner.next();
                System.out.println("Brand? examples: Tyson, Sysco, Hormel, Perdue Farms, GBS USA, Smithfield Foods  ");
                String brand2 = scanner.next();
                System.out.println("Organic?");
                String organic = scanner.next();
                System.out.println("Price we sell for?");
                double price2 = scanner.nextDouble();
                System.out.println("Which aisle?");
                int aisle2 = scanner.nextInt();
                System.out.println("Quantity?");
                int qty2 = scanner.nextInt();
                this.store.checkAndAddMeatType(type2, brand2, organic, price2, aisle2, qty2, (price2 * .5));
                break;
            default:
                add();
        }
    }

    public void sell() {
        System.out.println("What would you like to sell?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)) {
            case "F":
                this.store.displayFruitProductNames();
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Brand?");
                String brand = scanner.next();
                System.out.println("How many would you like to sell?");
                int qty1= scanner.nextInt();
                this.store.sellProduct(type, brand, qty1);
                break;
            case "M":
                this.store.displayMeatProductNames();
                System.out.println("Meat type?");
                String type2 = scanner.next();
                System.out.println("Brand?");
                String brand2 = scanner.next();
                System.out.println("How many would you like to sell?");
                int qty2= scanner.nextInt();
                this.store.sellProduct(type2, brand2, qty2);
                break;
            default:
                sell();
        }
    }

    public void remove() {
        System.out.println("What would you like to remove?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)) {
            case "F":
                this.store.displayFruitProductNames();
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Brand?");
                String brand = scanner.next();
                System.out.println("How many would you like to remove?");
                int qty1= scanner.nextInt();
                this.store.removeProduct(type, brand, qty1);
                break;
            case "M":
                this.store.displayMeatProductNames();
                System.out.println("Meat type?");
                String type1 = scanner.next();
                System.out.println("Brand?");
                String brand2 = scanner.next();
                System.out.println("How many would you like to remove?");
                int qty2= scanner.nextInt();
                this.store.removeProduct(type1, brand2, qty2);
                break;
            default:
                remove();
        }
    }
}






