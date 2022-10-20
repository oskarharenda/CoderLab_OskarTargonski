package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Arrays;
import java.util.Objects;

public class ShoppingCart {
    private static CartItem[] cartItems = new CartItem[0];
    private static int count = 0;

    public static void addProduct(Product product, int quantity) {
        cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
        CartItem cartItem = new CartItem(product, quantity);
        cartItems[count] = cartItem;
        count++;
    }

    public static void removeProduct(Product product) {
        CartItem[] updateTable = new CartItem[cartItems.length];
        int i = 0;
        for (CartItem s : cartItems) {
            if (!Objects.equals(s.getProduct(), product)) {
                updateTable[i] = s;
            }
            i++;
        }
        cartItems = Arrays.copyOf(updateTable, updateTable.length);
    }

    public void updateProduct(Product product, int quantity) {
        ShoppingCart.removeProduct(product);
        ShoppingCart.addProduct(product, quantity);
    }

    public int getTotalQuantity() {
        return cartItems.length;
    }

    public static CartItem[] getCartItems() {
        return cartItems;
    }

    public static double gerTotalSum() {
        double totalSum = 0;
        for (CartItem s : cartItems) {
            totalSum = totalSum + (s.getProduct().getPrice() * s.getQuantity());
        }
        return totalSum;
    }

    public String printRecipt() {
        StringBuilder loop = new StringBuilder();
        for (CartItem s : cartItems) {
            double result = s.getProduct().getPrice() * s.getQuantity();
            loop.append(s.getProduct().getName()).append(", ").append(s.getQuantity()).append("x");
            loop.append(s.getProduct().getPrice()).append(" = ").append(result).append("\n");
        }
        loop.append("---\nRazem: ").append(ShoppingCart.gerTotalSum());
        return loop.toString();
    }
}
