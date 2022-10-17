package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape{
    double r;
    public Circle(double x, double y, String color, double r ) {
        super(x, y, color);
        this.r=r;
    }

    public String getDescription(){
        return getX()+" "+getY()+" "+getColor()+" "+r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
    public double getCircuit(){
        return Math.PI*r*2;
    }
}
