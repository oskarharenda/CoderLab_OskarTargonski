package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main2 {
    public static void main(String[] args) {
        Shape shape = new Shape(3, 2, "red");
        Shape shape1 = new Shape(6, 1, "blue");
        Circle circle = new Circle(4, 1, "yellow", 5);
        System.out.println(shape1.getDescription());
        System.out.println(shape.getDistance(shape1));
        System.out.println(circle.getDiscription());
        System.out.println(circle.getArea());
        System.out.println(circle.getDistance(shape));
    }
}
