package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Test {
    public static void main(String[] args) {
        Product zabawka1 = new Product("samochód",10);
        Product zabawka2 = new Product("lalka",10);
        Product zabawka3 = new Product("mis",10);
        CartItem cartitem1 = new CartItem(zabawka1,2);

        ShoppingCart list = new ShoppingCart();
        list.addProduct(zabawka1,13);
        list.addProduct(zabawka2,1);
        list.addProduct(zabawka3,4);
        list.addProduct(zabawka3,3);
        System.out.println(list.toString());
        list.removeProduct(zabawka2);
        System.out.println(list.toString());


    }
}
