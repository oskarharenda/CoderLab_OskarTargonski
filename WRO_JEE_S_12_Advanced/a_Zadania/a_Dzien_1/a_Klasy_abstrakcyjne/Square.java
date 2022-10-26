package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculateCircuit() {
        return this.side * 4;
    }
}
