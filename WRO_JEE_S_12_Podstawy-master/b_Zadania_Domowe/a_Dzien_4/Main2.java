package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            int result = count("plik.txt");
            System.out.println(result);
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
        StringBuilder loop = new StringBuilder();
        int count = 0;
        int i = 0;
        while (scan.hasNext()) {
            loop.append(scan.nextLine() + " ");
        }
        String[] parts = loop.toString().split(" ");
        return parts.length;

    }


}


