package com.sandwichclub;
import java.util.List;
public class Sandwich {
    private String size;
    private String breadType;
    private boolean isToasted;
    private List<Topping> meats;
    private List<Topping> cheeses;
    private List<Topping> regularToppings;
    private List<String> sauces;

    public Sandwich(String size, String breadType, boolean isToasted,
                    List<Topping> meats, List<Topping> cheeses,
                    List<Topping> regularToppings, List<String> sauces) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
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
        for (Topping meat : meats) {
            extraToppingCost += meat.getPrice();
        }

        for (Topping cheese : cheeses) {
            extraToppingCost += cheese.getPrice();
        }


return basePrice + extraToppingCost;
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

    public List<Topping> getMeats() {
        return meats;
    }

    public List<Topping> getCheeses() {
        return cheeses;
    }

    public List<Topping> getRegularToppings() {
        return regularToppings;
    }

    public List<String> getSauces() {
        return sauces;

    }
        }