package com.sandwichclub;

public class Chips {
    private String type;

    public Chips(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {

        return switch (type.toLowerCase()) {
            case "regular", "barbecue", "sour cream" -> 1.50;
            case "jalapeno" -> 1.75;
            default -> 1.50;
        };
    }

    @Override
    public String toString() {
        return type + " chips";
    }
}



