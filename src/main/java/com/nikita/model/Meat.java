package com.nikita.model;

public class Meat extends Food {
    public Meat(int amount, double price){
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
