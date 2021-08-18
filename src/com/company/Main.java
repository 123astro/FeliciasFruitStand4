package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Product> keithProducts = new ArrayList<>();
    public static void main(String[] args) {

        boolean isOpen = true;
        Console newConsole = new Console();
        do {
            newConsole.getSelections();
        } while (isOpen);
    }


}




