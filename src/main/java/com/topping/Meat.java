package com.topping;

public class Meat extends Topping {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return switch (size) {
            case 4 -> 1.00;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0.0;
        };
    }
}
