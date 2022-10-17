package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append(scan.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        String text = reading.toString();
        String[] table = text.split("\n");
        int count = 1;
            for (String s : table){
                String tolower = s.toLowerCase();
                    if (tolower.contains("java")){
                        System.out.println("linia - " + count);
                    }
                count ++;
            }
    }
}
