package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Product {
    private int id;
    private String name;
    private static double price;
    private static int nextId = 1;

    public Product() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setPrice(double price) {
        if (price < 0.01){
            throw new NumberFormatException("Price has to be higher than 0");
        }
        else {
            Product.price = price;
        }
    }

    public static double getPrice() {
        return price;
    }
}
