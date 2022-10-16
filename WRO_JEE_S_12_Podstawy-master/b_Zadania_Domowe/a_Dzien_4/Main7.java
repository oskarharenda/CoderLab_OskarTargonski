package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        try {
            boolean result = rewrite();
            System.out.print(result);
        } catch (Exception e) {

        }

    }

    static boolean rewrite() throws Exception {

        System.out.print("Wpisz nazwę pliku:");
        Scanner scan = new Scanner(System.in);
        String test = scan.next();
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + test);
        File file = new File("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + test);
        StringBuilder loop = new StringBuilder();
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found");
        }
        Scanner scan2 = new Scanner(file);
        int count = 1;
        while (scan2.hasNextLine()) {
            loop.append(scan2.nextLine()).append("\n");
            count++;
        }
        try {
            PrintWriter printWriter = new PrintWriter("a_Zadania/d_Dzien_4/" +
                    "c_Pakiet_java_nio" + "/test2.txt");
            for (int i = 0; i < count; i++){
                printWriter.println(loop);
            }
            printWriter.close();
        }
        catch (FileNotFoundException ex){
            System.out.print("File not found");
        }

        return true;
    }
}
