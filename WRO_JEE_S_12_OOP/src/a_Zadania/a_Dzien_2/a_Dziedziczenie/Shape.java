package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String getDescription(){
        return x+" "+y+" "+color;
    }
    public double getDistance(Shape shape){
        return Math.sqrt(Math.pow(this.x-shape.x,2)+Math.pow(this.y-shape.y,2));
    }

}
