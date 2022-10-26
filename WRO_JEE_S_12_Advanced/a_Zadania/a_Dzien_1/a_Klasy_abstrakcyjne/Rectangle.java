package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Rectangle extends Shape {
    private double side_a;
    private double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    @Override
    double calculateCircuit() {
        return this.side_a * 2 + this.side_b * 2;
    }

    @Override
    double calculateArea() {
        return this.side_a * this.side_b;
    }
}
