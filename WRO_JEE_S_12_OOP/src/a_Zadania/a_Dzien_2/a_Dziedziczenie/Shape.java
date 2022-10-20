package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Shape {
    private double x;
    private double y;
    private String colour;

    public Shape (double x, double y, String colour){
        this.x = x;
        this.y = y;
        this.colour = colour;
    }
    public String getDescription(){
        return x + y + colour;
    }
    public double getDistance (Shape shape){
        return Math.sqrt(Math.pow(x - shape.x, 2) + Math.pow(y - shape.y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColour() {
        return colour;
    }
}
