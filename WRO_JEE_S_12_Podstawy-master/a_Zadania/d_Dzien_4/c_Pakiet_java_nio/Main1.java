package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.*;

public class Main1 {

    public static void main(String[] args) throws IOException {
    createDirectory("test");
    }
        static void createDirectory (String fileName) throws IOException {
            Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/test.txt");
            Files.exists(path);
            Files.createDirectory(path);
        }


}
