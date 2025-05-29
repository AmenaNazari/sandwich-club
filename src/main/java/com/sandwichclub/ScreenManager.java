package com.sandwichclub;

import java.util.Scanner;

public class ScreenManager {
    private Scanner scanner;

    public ScreenManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showHome() {
        System.out.println(" Welcome to Sandwich Club!");
        System.out.println("Make your day better with one delicious sandwich!");
    }

    public void showOrderMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. I want to order");
        System.out.println("2. I am done!");
    }
}

