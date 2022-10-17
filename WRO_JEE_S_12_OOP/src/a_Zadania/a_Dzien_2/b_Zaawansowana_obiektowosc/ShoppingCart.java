package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import a_Zadania.a_Dzien_1.c_Metody.Car;

import java.util.Arrays;
import static java.util.Arrays.copyOf;

public class ShoppingCart {
    CartItem[] cartItems = new CartItem[1];

    public void addProduct(Product product, int quantity) {

        cartItems[cartItems.length - 1] = new CartItem(product, quantity);
        cartItems[cartItems.length - 1].setQuantity(quantity);
        for (int i = 0; i < cartItems.length - 1; i++) {
            if (cartItems[i].getProduct() == product) {
                cartItems[i].setQuantity(cartItems[i].getQuantity() + quantity);
                cartItems = copyOf(cartItems, cartItems.length - 1);
            }

        }
        cartItems = copyOf(cartItems, cartItems.length + 1);
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < cartItems.length - 1; i++) {
            if (cartItems[i].getProduct() == product) {
                cartItems[i].setQuantity(0);
                for(int j=i; j<cartItems.length; j++){
                    cartItems[i]=cartItems[i+1];
                }
                cartItems= copyOf(cartItems, cartItems.length - 1);
                cartItems[cartItems.length-1]=null;
            }

        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + Arrays.toString(cartItems) +
                '}';
    }
}
