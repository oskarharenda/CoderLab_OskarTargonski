package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Circle extends Shape{

    private double radius;

    public Circle(double x, double y, String colour, double radius) {
        super(x, y, colour);
        this.radius = radius;
    }

    public String getDiscription(){
        return getY() + getX() + getColour() + radius;
    }
    public double getArea (){
        return 3.14 * radius * radius;
    }
    public double getCircuit(){
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }
}
