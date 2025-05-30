package com.model;

public class Drink {
    private String flavor;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor.toLowerCase();
        this.size = size.toLowerCase();
    }

    public double getPrice() {
        return switch (size) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }

    @Override
    public String toString() {
        return flavor + " (" + size + ") - $" + String.format("%.2f", getPrice());
    }
}
