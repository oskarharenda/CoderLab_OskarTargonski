package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        try {
            String[] table = retirement();
            System.out.println(Arrays.toString(table));
        } catch (Exception e) {

        }


    }

    static String[] retirement() throws Exception {
        //System.out.print("Wpisz nazwę pliku: ");
        //Scanner scan = new Scanner(System.in);
        //String fileName = scan.next();
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/plik.txt");
        File file = new File("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/plik.txt");
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found");
        }
        Scanner scan2 = new Scanner(file);
        StringBuilder loop = new StringBuilder();
        int count = 0;
        while (scan2.hasNextLine()) {
            loop.append(scan2.nextLine()).append(".");
            count++;
        }
        String[] parts = loop.toString().split("\\.");
        String[] retirementTable = new String[count];
        int i = 0;
        for (String s : parts) {
            String[] parts2 = s.split(" ");
            int age = Integer.parseInt(parts2[2]);
            if (Objects.equals(parts2[3], "K") && age <= 1962) {
                retirementTable[i] = s.concat(" ");
                i++;
            } else if (Objects.equals(parts2[3], "M") && age <= 1957) {
                retirementTable[i] = s.concat(" ");
                i++;
            }
        }
        return Arrays.copyOf(retirementTable, count - (count - i));
    }
}
