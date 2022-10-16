package b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    int[] result = sortedArray();
    System.out.print(Arrays.toString(result));

    }
    static int[] sortedArray(){
        System.out.print("Wpisz liczbę:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] table = new int[number];
        Random r = new Random();
        int result;
        for (int i = 0; i < table.length; i++){
            result = r.nextInt(101);
            table[i] = result;
        }
        Arrays.sort(table);
        return table;
    }


}
