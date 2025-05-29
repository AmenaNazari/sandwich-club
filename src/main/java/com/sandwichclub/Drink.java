package com.sandwichclub;

public class Drink {
    private String flavor;
    private String drinkSize;

    public Drink(String flavor, String drinkSize) {
        this.flavor = flavor;
        this.drinkSize = drinkSize;
    }


    public double getPrice() {
        switch (drinkSize.toLowerCase()) {
            case "small": return 1.50;
            case "medium": return 2.00;
            case "large": return 2.50;
            default: return 0.00;
        }
    }


    public String getFlavor() {
        return flavor;
    }

    public String getDrinkSize() {
        return drinkSize;

    }
    @Override
    public String toString() {
        return drinkSize + " " + flavor;
    }

}








