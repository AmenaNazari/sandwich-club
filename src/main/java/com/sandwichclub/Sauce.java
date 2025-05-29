package com.sandwichclub;

public class Sauce extends Topping {
    public Sauce(String name) {
        super(name); // only the name is needed
    }

    @Override
    public double getPrice(int size) {
        return 0.00; // sauces are always free
    }

    @Override
    public String toString() {
        return getName(); // no extra label needed
    }
}

