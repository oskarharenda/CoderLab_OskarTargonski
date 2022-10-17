package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        getInfo();
    }

    static void getInfo() {
        System.out.println("Podaj imię");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Podaj wiek");
        String age = scan.next();
        String result = name + " ma " + age + " lat ";
        System.out.println(result);

    }
}
