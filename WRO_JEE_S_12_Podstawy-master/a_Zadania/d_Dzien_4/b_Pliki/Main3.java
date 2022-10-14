package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static sun.util.locale.LocaleUtils.isNumeric;

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
        System.out.println(test);
        String[] table = test.split(",");
        int result = 0;
        int sum = 0;
        for (String s : table) {
            if (isNumeric(s)){
                result += sum;
            }
        }
        System.out.println(result);
    }
}
