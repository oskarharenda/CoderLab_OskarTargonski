package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc.Product;

public class Test {
    public static void main(String[] args) {
        Product jablko = new Product("jabłko", 2.50);
        Product marchew = new Product("marchwka",3);

        System.out.println(marchew.toString());
        System.out.println(jablko.toString());
        System.out.println("napis");
    }
}
