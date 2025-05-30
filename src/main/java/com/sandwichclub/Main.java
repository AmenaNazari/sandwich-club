package com.sandwichclub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Sandwich Club!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int input = scanner.nextInt();
            scanner.nextLine(); // Clear newline

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
        String orderId = "ORDER1";
        Order order = new Order(orderId);

        boolean ordering = true;

        while (ordering) {
            System.out.println("\nOrder Options:");
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


    private static void addSandwich(Scanner scanner, Order order) {
        System.out.println("Enter sandwich size (4, 8, or 12 inches):");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose bread type (white, wheat, rye, wrap):");
        String bread = scanner.nextLine();

        System.out.println("Would you like it toasted? (yes/no):");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Would you like extra meat? (yes/no):");
        boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Would you like extra cheese? (yes/no):");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, toasted, extraMeat, extraCheese);

        // Add meat toppings
        System.out.println("Add meats (type 'done' to finish): steak, ham, salami, roast beef, chicken, bacon");
        while (true) {
            String meat = scanner.nextLine();
            if (meat.equalsIgnoreCase("done")) break;
            sandwich.addTopping(new Meat(meat));
        }

        // Add cheese toppings
        System.out.println("Add cheeses (type 'done' to finish): american, provolone, cheddar, swiss");
        while (true) {
            String cheese = scanner.nextLine();
            if (cheese.equalsIgnoreCase("done")) break;
            sandwich.addTopping(new Cheese(cheese));
        }

        // Add regular toppings
        System.out.println("Add regular toppings (type 'done' to finish): lettuce, peppers, onions, tomatoes, jalapeños, cucumbers, pickles, guacamole, mushrooms");
        while (true) {
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("done")) break;
            sandwich.addTopping(new RegularTopping(topping));
        }

        // Add sauces
        System.out.println("Add sauces (type 'done' to finish): mayo, mustard, ketchup, ranch, thousand islands, vinaigrette");
        while (true) {
            String sauce = scanner.nextLine();
            if (sauce.equalsIgnoreCase("done")) break;
            sandwich.addTopping(new Sauce(sauce));
        }

        order.addSandwich(sandwich);
        System.out.println(" Sandwich added: " + sandwich);
    }


    private static void addDrink(Scanner scanner, Order order) {
        System.out.println("Enter drink flavor:");
        String flavor = scanner.nextLine();

        System.out.println("Enter drink size (small, medium, large):");
        String size = scanner.nextLine().toLowerCase();

        if (!size.equals("small") && !size.equals("medium") && !size.equals("large")) {
            System.out.println("Invalid size. Defaulting to medium.");
            size = "medium";
        }

        Drink drink = new Drink(flavor, size);
        order.addDrink(drink);
        System.out.println("Drink added: " + drink);
    }


    private static void addChips(Scanner scanner, Order order) {
        System.out.println("Enter chip flavor (e.g., BBQ, Sour Cream, Original):");
        String flavor = scanner.nextLine();

        Chips chips = new Chips(flavor);
        order.addChips(chips);

        System.out.println("Chips added: " + chips);
    }


    private static void checkout(Order order) {
        System.out.println("\n--- Order Summary ---");
        order.printSummary();

        System.out.println("\nSaving receipt...");
        RecipeWriter writer = new RecipeWriter();
        writer.writeRecipe(order);
    }
}

