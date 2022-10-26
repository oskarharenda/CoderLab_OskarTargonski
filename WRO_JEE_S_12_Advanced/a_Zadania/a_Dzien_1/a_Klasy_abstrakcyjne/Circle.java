package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Circle extends Shape {
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return pi * this.radius * this.radius;
    }

    @Override
    double calculateCircuit() {
        return 2 * pi * this.radius;
    }
}
