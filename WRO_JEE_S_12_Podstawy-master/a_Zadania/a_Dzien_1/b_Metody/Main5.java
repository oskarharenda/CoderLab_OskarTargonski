package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        double netto = calculateNetto (40, 0.1);
        System.out.print (netto);

    }
    static double calculateNetto (double gross, double vat){
        return gross * (1 - vat);
        //
    }
}
