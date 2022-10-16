package b_Zadania_Domowe.a_Dzien_4;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
    printTriangle();

    }
    static void printTriangle(){
        System.out.print("Wpisz liczbę:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        StringBuilder loop = new StringBuilder();
        for (int i = 1; i <= number; i++){
            loop.append("*");
            System.out.println(loop);
        }
    }


}
