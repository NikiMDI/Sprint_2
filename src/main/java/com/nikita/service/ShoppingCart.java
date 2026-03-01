package com.nikita.service;
import com.nikita.model.Apple;
import com.nikita.model.Food;
import com.nikita.model.constants.Colour;

public class ShoppingCart {
    private Food[] items;
    private static double totalPrice;
    private static double totalPriceVeganProduct;
    private static double totalDiscount;
    private static double totalWithoutDiscount;


    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double allTotalPrice(){
        for(Food item : items){
            totalPrice += (item.getAmount() * item.getPrice());
        }
        return totalPrice;
    }

    public double allTotalPriceWithDiscount(){
        for(Food item : items){
            double itemPrice = item.getAmount() * item.getPrice();
            double discountPercent = item.getDiscount();

            totalWithoutDiscount += itemPrice;
            totalDiscount += itemPrice * (discountPercent / 100);
        }
        return totalWithoutDiscount - totalDiscount;
    }

    public double allTotalPriceVeganProduct(){
        for(Food item : items){
            if(item.isVegetarian()){
                totalPriceVeganProduct += (item.getAmount() * item.getPrice());
            }
        }
        return totalPriceVeganProduct;
    }

}
