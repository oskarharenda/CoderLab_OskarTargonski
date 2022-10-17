package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Objects;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        nettoBrutto();

    }

    static void nettoBrutto() {
        System.out.println("Podaj typ - bn lub nb: ");
        Scanner scan = new Scanner(System.in);
        String test = scan.next();
        while (!Objects.equals(test, "bn") && !Objects.equals(test, "nb")) {
            System.out.println("Podaj bn lub nb" + "\n" + "durniu");
            test = scan.next();
        }
        if (Objects.equals(test, "bn")) {
            System.out.println("Podaj wartość brutto");
            double brutto = scan.nextDouble();
            brutto *= 0.75;
            System.out.print("Netto = " + brutto);
        }
         else if (Objects.equals(test, "nb")) {
            System.out.println("Podaj wartość netto");
            double netto = scan.nextDouble();
            netto *= 1.3;
            System.out.print("Brutto = " + netto);


        }

    }
}
