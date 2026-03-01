package com.nikita.model;
import static com.nikita.model.constants.Colour.RED;
import static com.nikita.model.constants.Discount.DISCOUNT_RED_APPLE;


public class Apple extends Food{
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return DISCOUNT_RED_APPLE;
        }
        return 0.0;
    }
}
