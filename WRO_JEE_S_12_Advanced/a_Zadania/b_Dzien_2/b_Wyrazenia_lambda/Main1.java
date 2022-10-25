package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            lines.add(line);
        }
        System.out.println(lines);
        lines.sort(((a,b) -> a.compareToIgnoreCase(b)));
        System.out.println(lines);
    }


}
