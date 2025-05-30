package com.sandwichclub;

import java.util.Scanner;

public class ScreenManager {
    private Scanner scanner;

    public ScreenManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showHome() {
        System.out.println("=== Welcome to Sandwich Club!");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
    }

    public void showOrderMenu() {
        System.out.println("\n--- Order Options ---");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
    }
}
