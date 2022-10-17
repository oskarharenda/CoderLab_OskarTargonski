package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        try {
            writeToFile("test3.txt");
        } catch (Exception e) {
        }

    }

    static void writeToFile(String fileName) throws Exception {
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        PrintWriter writer = new PrintWriter("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found");
        }
        System.out.println("Podaj słowo: ");
        Scanner scan = new Scanner(System.in);
        String text = "";
        while (!Objects.equals(text, "quit")) {
            text = scan.nextLine();
            if (Objects.equals(text, "quit")) {
                break;
            }
            writer.println(text);
        }
        writer.close();
    }
}