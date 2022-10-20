package a_Zadania.a_Dzien_1.c_Metody;

public class Car {
    private Person p = new Person();
    public String brand;
    public String model;
    public double price;

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public Car setModel(String model) {
        this.model = model;
        return this;
    }
    public Car setPrice(double price) {
        this.price = price;
        return this;
    }
    public String getBrand () {
        return brand;
    }
    public String getModel () {
        return model;
    }
    public double getPrice () {
        return price;
    }
    public String toString(){
        String cena = String.valueOf(price);
        return brand + " " + model + cena;
    }
}
