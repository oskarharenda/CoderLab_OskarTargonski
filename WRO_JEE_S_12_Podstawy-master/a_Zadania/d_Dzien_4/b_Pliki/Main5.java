package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text2.txt");
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append(scan.nextLine()).append(" ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        String text = reading.toString();
        String tolower = text.toLowerCase();
        String[] table = tolower.split(" ");
        System.out.println(Arrays.toString(table));
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
    }
}