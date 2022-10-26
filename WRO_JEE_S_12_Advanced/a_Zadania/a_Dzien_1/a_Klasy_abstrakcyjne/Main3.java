package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        Square square = new Square(1.2);
        list.add(circle);
        list.add(rectangle);
        list.add(square);

        String str = "Prostokąt o bokach " + rectangle.getSide_a() + " i " + rectangle.getSide_b() + " - pole = " +
                rectangle.calculateArea() + ", obwód = " + rectangle.calculateCircuit() + ",\n" +
                "Kwadrat o boku " + square.getSide() + " - pole = " + square.calculateArea() + ", obwód = " + square.calculateCircuit() + ",\n" +
                "Koło o promieniu " + circle.getRadius() + " - pole = " + circle.calculateArea() + ", obwód = " + circle.calculateCircuit();


        System.out.println(str);



    }
}
