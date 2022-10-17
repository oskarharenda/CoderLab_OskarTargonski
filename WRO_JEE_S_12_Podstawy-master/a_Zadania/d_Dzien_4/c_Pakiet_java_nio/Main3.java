package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) {
        try {
            copyFile("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/", "test1.txt", "test2.txt");
        } catch (Exception e) {
        }
    }

    static void copyFile(String directory, String fileName, String secondFileName) throws Exception {
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + fileName);
        Path path2 = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + secondFileName);
        if (!Files.exists(path)) {
            System.out.println("Plik 1 nie istnieje");
            throw new FileNotFoundException("Plik 1 nie istnieje");
        }
//        if (!Files.exists(path2)) {
//            System.out.println("Plik 2 nie istnieje");
//            throw new FileNotFoundException("Plik 2 nie istnieje");
//        }
        try {
            Files.copy(path, path2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
