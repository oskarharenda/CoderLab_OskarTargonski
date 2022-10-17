package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main6 {

    public static void main(String[] args) {
    equation();

    }
    static void equation(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scan.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        double x1 = (- b - sqrt(delta)) / (2 * a);
        double x2 = (- b + sqrt(delta)) / (2 * a);
        System.out.println(delta);
        System.out.println(x1);
        System.out.println(x2);
    }

}
