package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    public static void main(String[] args) {
        double usd = convertToUsd (25);
        System.out.print (usd);
    }
    static double convertToUsd (double pln){
        return pln * 4.04;
    }
}
