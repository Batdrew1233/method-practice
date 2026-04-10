package com.plurasight;

public class Menu {
    public static void main(String[] args) {
        //Call Menu Twice
        displayMenu();
        displayMenu();
    }

    // Static Method Display Menu
    public static void displayMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
}
