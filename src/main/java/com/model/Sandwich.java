package com.model;

import com.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private int sizeInInches;
    private String breadType;
    private boolean toasted;
    private List<Topping> toppings;
    private boolean extraMeat;
    private boolean extraCheese;

    public Sandwich(int sizeInInches, String breadType, boolean toasted,
                    boolean extraMeat, boolean extraCheese) {
        this.sizeInInches = sizeInInches;
        this.breadType = breadType;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        double basePrice = switch (sizeInInches) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };

        // Add topping prices
        for (Topping topping : toppings) {
            basePrice += topping.getPrice(sizeInInches);
        }

        // Extra meat
        if (extraMeat) {
            basePrice += switch (sizeInInches) {
                case 4 -> 0.50;
                case 8 -> 1.00;
                case 12 -> 1.50;
                default -> 0.0;
            };
        }

        // Extra cheese
        if (extraCheese) {
            basePrice += switch (sizeInInches) {
                case 4 -> 0.30;
                case 8 -> 0.60;
                case 12 -> 0.90;
                default -> 0.0;
            };
        }

        return basePrice;
    }

    public String toString() {
        return sizeInInches + "\" " + breadType +
                (toasted ? " (Toasted)" : "") +
                ", Toppings: " + toppings.stream().map(Topping::getName).toList() +
                (extraMeat ? ", Extra Meat" : "") +
                (extraCheese ? ", Extra Cheese" : "") +
                String.format(" [$%.2f]", getPrice());
    }
}
