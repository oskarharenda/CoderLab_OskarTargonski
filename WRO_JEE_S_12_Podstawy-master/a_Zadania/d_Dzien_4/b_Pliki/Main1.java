package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("Main1.txt");
            Scanner scan = new Scanner(System.in);
            String text = "";
            while (!Objects.equals(text, "quit")) {
                text = scan.nextLine();
                if (Objects.equals(text, "quit")) {
                    writer.close();
                    break;
                }
                writer.println(text + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Błąd zapisu pliku");
        }
    }
}