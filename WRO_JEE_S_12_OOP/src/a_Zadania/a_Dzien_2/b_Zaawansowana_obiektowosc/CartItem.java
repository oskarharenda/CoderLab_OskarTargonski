package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class CartItem extends Product {
    private static int quantity;
    Product newProduct = new CartItem(Product.getNextId());

    public CartItem(int quantity) {
        CartItem.quantity = quantity;
    }

    public static int getQuantity() {
        return quantity;
    }
}
