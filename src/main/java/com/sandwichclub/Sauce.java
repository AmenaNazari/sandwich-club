package com.sandwichclub;

public class Sauce extends Topping {
    public Sauce(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0.00;
    }

    @Override
    public String toString() {
        return getName();
    }
}

