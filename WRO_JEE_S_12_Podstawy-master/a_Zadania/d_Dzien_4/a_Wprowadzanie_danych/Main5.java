package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Objects;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();

    }

    static void textLines() {
        System.out.println("Podaj słowo: ");
        Scanner scan = new Scanner(System.in);
        String text = "";
        StringBuilder sum = new StringBuilder();
        while (!Objects.equals(text, "quit")) {
            text = scan.next();
                if (Objects.equals(text, "quit")){
                break;}
            sum.append(text).append(" ");
        }
        System.out.println(sum);
    }
}
