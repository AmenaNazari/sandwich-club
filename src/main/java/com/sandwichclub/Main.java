package com.sandwichclub;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Sandwich Club!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    startNewOrder(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    private static void startNewOrder(Scanner scanner) {
        Order order = new Order(
                UUID.randomUUID().toString(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                LocalDateTime.now()
        );

        boolean ordering = true;

        while (ordering) {
            System.out.println("Order Options:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSandwich(scanner, order);
                    break;
                case 2:
                    addDrink(scanner, order);
                    break;
                case 3:
                    addChips(scanner, order);
                    break;
                case 4:
                    checkout(order);
                    ordering = false;
                    break;
                case 0:
                    System.out.println("Order canceled.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }


    // Placeholder methods to implement next
    private static void addSandwich(Scanner scanner, Order order) {
        System.out.println(" Adding sandwich... (method to be implemented)");
    }

    private static void addDrink(Scanner scanner, Order order) {
        System.out.println(" Adding drink... (method to be implemented)");
    }

    private static void addChips(Scanner scanner, Order order) {
        System.out.println(" Adding chips... (method to be implemented)");
    }

    private static void checkout(Order order) {
        System.out.println(" Checking out... (method to be implemented)");
    }
}
