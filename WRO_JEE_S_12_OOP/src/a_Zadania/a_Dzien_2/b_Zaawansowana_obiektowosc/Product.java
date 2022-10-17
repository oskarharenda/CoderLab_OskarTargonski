package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {
    private int id;
    private String name;
    private double price;
    private static int nextId;

    public Product(String name, double price) {
        this.id =nextId;
        this.name = name;
        this.price = price;
        setPrice(price);
        nextId++;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price<0.01) {
            throw new IllegalArgumentException("Nie ma tak małej cany!!!");
        }
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
