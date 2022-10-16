package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            randNumbers[i] = r.nextInt(100);
        }
        for (int i : randNumbers) {
            System.out.println(i);

        }
        Arrays.sort(randNumbers);
        System.out.print("Najmniejsza liczba: " + randNumbers[0]);


    }
}
