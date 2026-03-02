package com.nikita;
import com.nikita.model.Apple;
import com.nikita.model.Food;
import com.nikita.model.Meat;
import com.nikita.service.ShoppingCart;


//Импорт в dev
import static com.nikita.model.constants.Colour.RED;
import static com.nikita.model.constants.Colour.GREEN;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] product = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(product);

        System.out.println("Общая сумму товаров без скидки = " + cart.allTotalPrice());
        System.out.println("Общая сумму товаров со скидкой = " + cart.allTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки = " + cart.allTotalPriceVeganProduct());
    }
}