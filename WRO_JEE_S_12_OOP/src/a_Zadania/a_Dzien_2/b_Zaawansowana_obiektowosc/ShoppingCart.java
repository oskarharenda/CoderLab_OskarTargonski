package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Arrays;
import java.util.Objects;

public class ShoppingCart {
        private static CartItem[] cartItems;

        public static void addProduct (Product product, int quantity){
                for (int i = 0; i < quantity; i++){
                        product = new CartItem(quantity);
                        cartItems[i] = product;
                }
        }
        public static void removeProduct (Product product){
                CartItem[] updateTable = new CartItem[cartItems.length];
                int i = 0;
                for (CartItem s : cartItems){
                        if (!Objects.equals(s, product)){
                             updateTable[i] = s;
                        }
                        i++;
                }
                cartItems = Arrays.copyOf(updateTable, updateTable.length);
        }
        public void updateProduct(Product product, int quantity){
                ShoppingCart.removeProduct(product);
                ShoppingCart.addProduct(product, quantity);
        }
        public int getTotalQuantity(){
                return cartItems.length;
        }
        public static double gerTotalSum(){
                double totalSum = 0;
                for (CartItem s : cartItems){
                        totalSum += Product.getPrice();
                }
                return totalSum;
        }
        public String printRecipt(){
                StringBuilder loop = new StringBuilder();
                for (CartItem s : cartItems){
                        double result = Product.getPrice() * CartItem.getQuantity();
                        loop.append(s).append(", ").append(CartItem.getQuantity()).append("x");
                        loop.append(Product.getPrice()).append(" = ").append(result).append("\n");
                }
                loop.append("---\nRazem: ").append(ShoppingCart.gerTotalSum());
                return loop.toString();
        }
}
