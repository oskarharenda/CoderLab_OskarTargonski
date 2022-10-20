package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import a_Zadania.a_Dzien_2.a_Dziedziczenie.AdvancedCalculator;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Product product = new Product("Jabłko", 2.5);
        Product product1 = new Product("Komputer", 2500.0);
        Product product2 = new Product("Szklanka", 10.0);

        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCart.addProduct(product, 1);
        ShoppingCart.addProduct(product1, 2);
        ShoppingCart.addProduct(product2, 4);
        System.out.println(shoppingCart.printRecipt());
        System.out.println(ShoppingCart.gerTotalSum());


    }

}
