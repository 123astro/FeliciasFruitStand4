package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);
    private Store store;


    public Console() {
        this.store = new Store();
    }

    public void getSelections() {

        System.out.println("\nWould you like to:" +
                "\nAdd ?       1 " +
                "\nSell ?      2" +
                "\nRemove ?    3" +
                "\nInventory ? 4");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1 -> this.add();
            case 2 -> this.sell();
            case 3 -> this.remove();
            case 4 -> this.store.displayProducts();
            default -> getSelections();
        }
    }

    public void add() {
        System.out.println("What would you like to add?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)) {
            case "F":
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Brand? example Chiquita, Del monte, Dole, Matson");
                String brand = scanner.next();
                System.out.println("Fruit color?");
                String color = scanner.next();
                System.out.println("Price?");
                double price = scanner.nextDouble();
                System.out.println("Which aisle?");
                int aisle = scanner.nextInt();
                System.out.println("Quantity?");
                int qty1 = scanner.nextInt();
                for (int i = 0; i < this.store.feliciasProducts.size(); i++)
                if(Objects.equals(type, this.store.feliciasProducts.get(i).type)) {
                    if (Objects.equals(brand, this.store.feliciasProducts.get(i).brand)) {
                        this.store.feliciasProducts.get(i).setQty(this.store.feliciasProducts.get(i).getQty() + qty1);
                        return;
                    }
                }
                this.store.addFruit(type, brand, color, price, aisle, qty1,
                        (price * .8));
                break;
            case "M":
                System.out.println("Meat type?");
                String type2 = scanner.next();
                System.out.println("Brand? examples: Tyson, Sysco, Hormel, Perdue");
                String brand2 = scanner.next();
                System.out.println("Organic?");
                String organic = scanner.next();
                System.out.println("Price?");
                double price2 = scanner.nextDouble();
                System.out.println("Which aisle?");
                int aisle2 = scanner.nextInt();
                System.out.println("Quantity?");
                int qty2 = scanner.nextInt();
                this.store.addMeat(type2, brand2, organic, price2, aisle2, qty2 , (price2 * .5));
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
                this.store.sellProduct(type, brand);
                break;
            case "M":
                this.store.displayMeatProductNames();
                System.out.println("Meat type?");
                String type1 = scanner.next();
                System.out.println("Brand?");
                String brand2 = scanner.next();
                this.store.sellProduct(type1, brand2);
                break;
            default:
                sell();
        }
    }
    public void remove() {
        System.out.println("What would you like to sell?\nFruit? F\nMeat? M");
        String input = scanner.next();
        switch (input.toUpperCase(Locale.ROOT)) {
            case "F":
                System.out.println("Fruit type?");
                String type = scanner.next();
                System.out.println("Brand?");
                String brand = scanner.next();
                this.store.removeProduct(type, brand);
                break;
            case "M":
                System.out.println("Meat type?");
                String type1 = scanner.next();
                System.out.println("Brand?");
                String brand2 = scanner.next();
                this.store.removeProduct(type1, brand2);
                break;
            default:
                remove();
        }
    }

}






