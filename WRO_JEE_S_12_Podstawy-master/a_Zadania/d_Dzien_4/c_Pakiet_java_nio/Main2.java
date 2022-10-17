package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) {
        try {
            createFile("plik.txt");
        } catch (Exception e) {
            System.out.println("File allready exist");
        }
    }

    static void createFile(String fileName) throws Exception {
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        if (Files.exists(path)) {
            throw new FileAlreadyExistsException("File exist");
        }
        PrintWriter file = new PrintWriter("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
    }

}
