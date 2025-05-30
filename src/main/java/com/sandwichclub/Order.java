package com.sandwichclub;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private LocalDateTime timestamp;

    public Order(String orderId) {
        this.orderId = orderId;
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.timestamp = LocalDateTime.now();
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chips c : chips) total += c.getPrice();
        return total;
    }

    public void printSummary() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Time: " + timestamp);

        System.out.println("\nSandwiches:");
        for (Sandwich s : sandwiches) System.out.println(" - " + s);

        System.out.println("\nDrinks:");
        for (Drink d : drinks) System.out.println(" - " + d);

        System.out.println("\nChips:");
        for (Chips c : chips) System.out.println(" - " + c);

        System.out.printf("\nTotal: $%.2f\n", getTotalCost());
    }
}
