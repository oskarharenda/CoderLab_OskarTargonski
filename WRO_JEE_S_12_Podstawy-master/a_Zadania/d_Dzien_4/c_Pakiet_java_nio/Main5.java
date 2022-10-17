package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        try {
            readFromFile("test4.txt");
        } catch (Exception e) {

        }

    }

    static void readFromFile(String fileName) throws Exception {
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        Path path2 = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/plik.txt");
        File file = new File("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        Scanner scan = new Scanner(file);
        StringBuilder loop = new StringBuilder();
        loop.append("<html>").append("\n").append("<body>").append("\n");
        FileWriter printWriter = new FileWriter("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/plik.txt", false);

        if (!Files.exists(path) || !Files.exists(path2)) {
            throw new FileNotFoundException("File not found");
        }
        while (scan.hasNextLine()) {
            loop.append("<p>").append(scan.nextLine()).append("</p").append("\n");
        }
        printWriter.append(loop.append("</html>").append("\n").append("</body>"));
        printWriter.close();
        System.out.print(loop);
    }


}
