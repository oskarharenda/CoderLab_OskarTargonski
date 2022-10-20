package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Product {
    private int id;
    private String name;
    private double price;
    private int nextId = 1;

    public Product(String name, double price) {
        this.name = name;
        this.id = nextId;
        this.price = price;
        setPrice(price);
        nextId++;
    }

    public int getNextId() {
        return nextId;
    }

    public void setPrice(double price) {
        if (price < 0.01){
            throw new IllegalArgumentException("Price has to be higher than 0");
        }
        else {
            this.price = price;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }
}
