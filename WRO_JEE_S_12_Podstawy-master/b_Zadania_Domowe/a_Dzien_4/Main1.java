package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        try {
            int result = count("plik.txt");
            System.out.print(result);
        } catch (Exception e) {

        }
    }

    static int count(String fileName) throws Exception {
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        File file = new File("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found");
        }
        Scanner scan = new Scanner(file);
        StringBuilder count = new StringBuilder();
        while (scan.hasNextLine()) {
            count.append(scan.nextLine());
        }
        return count.toString().length();

    }

}
