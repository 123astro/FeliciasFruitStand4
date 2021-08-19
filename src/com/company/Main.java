package com.company;



public class Main {

    public static void main(String[] args) {

        boolean isOpen = true;
        Console newConsole = new Console();

        do {
            newConsole.getSelections();
        } while (isOpen);
    }


}




