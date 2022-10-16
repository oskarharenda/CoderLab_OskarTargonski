package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
        StringBuilder text = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                text.append(scan.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pliku");
            System.out.println(e);
        }
        String test = text.toString();
        String[] table = test.split("[,\\n]");
        double result = 0;
        double sum;
        for (String s : table) {
            try {
                sum = Double.parseDouble(s);
                result += sum;
            } catch (NumberFormatException e) {
                System.out.println(s + " is not a number");
            }
        }
        System.out.println(result);
    }
}
