package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        rowsColumns();

    }

    static void rowsColumns() {
        System.out.print("Podaj liczbę wierszy: ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int columns = scan.nextInt();
        int[][] table = new int[rows][columns];
        int count = 1;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = count;
                sum += count;
                count++;

            }


        }
        average = sum / count;
        System.out.println("Suma liczb to: " + sum);
        System.out.println("Średnia to: " + average);

    }
}
