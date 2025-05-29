package com.sandwichclub;
import java.util.ArrayList;
import java.util.List;
public class Sandwich {
    private String size;
    private String breadType;
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private List<Topping> toppings;

    public Sandwich(String size, String breadType, boolean extraCheese, boolean extraMeat, boolean isToasted ) {
        this.size = size;
        this.breadType = breadType;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<>();
    }


    public double getPrice() {

            double basePrice = 0.0;

            switch (size.toLowerCase()) {
                case "small":
                    basePrice = 5.00;
                    break;

                case "medium":
                    basePrice = 7.00;
                    break;

                case "large":
                    basePrice = 8.50;
                    break;

                default:
                    basePrice = 0.00;
                    break;
            }



        double extraToppingCost = 0.0;

        if (extraMeat) basePrice += 1.00;
        if (extraCheese) basePrice += 1.00;

        return basePrice;
    }



        public String getSize() {
        return size;
    }

    public String getBreadType() {
        return breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }


    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size='" + size + '\'' +
                ", isToasted=" + isToasted +
                ", extraMeat=" + extraMeat +
                ", extraCheese=" + extraCheese +
                ", toppings=" + toppings +
                '}';
    }
}
