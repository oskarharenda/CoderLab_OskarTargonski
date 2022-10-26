package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Main1 {
    public static void main(String[] args) {
        Vehicle[] test = new Vehicle[2];
        Car car = new Car(140, "Corolla", "hotHatch");
        Train train= new Train(100, "P40", 600);
        test[0] = car;
        test[1] = train;

        for (Vehicle e : test){
            System.out.println(e.toString());
        }

    }
}