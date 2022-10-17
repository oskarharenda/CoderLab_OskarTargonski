package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        operations();

    }
    static void operations(){

        System.out.println("Podaj pierwszą liczbę");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int second = scan.nextInt();

        int sum = first + second;
        System.out.println("Wynik dodawania = " + sum);

        int subtract = first - second;
        System.out.println("Wynik odejmowania = " + subtract);

        int multiplication = first * second;
        System.out.println("Wynik mnożenia = " + multiplication);

        int divide = first / second;
        System.out.println("Wynik dzielenia = " + divide);
    }
}
