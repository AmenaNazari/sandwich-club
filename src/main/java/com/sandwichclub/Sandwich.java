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

    public Sandwich(String size, String breadType, boolean isToasted, List<Topping> meats, List<Topping> cheeses, List<Topping> regularToppings, List<String> sauces) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
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
