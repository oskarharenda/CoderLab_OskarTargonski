package b_Zadania_Domowe.a_Dzien_4;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
    boolean result = checkFileExist();
    System.out.print(result);

    }
    static boolean checkFileExist(){
        System.out.print("Wpisz nazwę pliku:");
        Scanner scan = new Scanner(System.in);
        String test = scan.next();
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pakiet_java_nio/" + test);
        if (Files.exists(path)){
            return true;
        }
        else {
            return false;
        }

    }


}
