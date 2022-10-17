package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        getData();

    }

    static void getData() {
        System.out.print("Podaj liczbę");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        int count = -1;
        while (number != 0) {
            number = scan.nextInt();
            sum += number;
            count ++;
        }
        System.out.print(sum + " " + count);

    }
}
