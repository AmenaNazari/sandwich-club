package com.sandwichclub;

public class Cheese extends Topping {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0.0;
        };
    }
}
