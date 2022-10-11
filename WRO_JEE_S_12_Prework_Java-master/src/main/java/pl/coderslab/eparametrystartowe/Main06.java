package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {
        int table = Integer.parseInt(args[0]);
        for (int i = 1; i < table + 1; i++) {
            for (int j = 1; j < table + 1; j++) {
                System.out.println(i + " x " + j + " = " + i * j);

            }
            System.out.println("\n");
        }

    }
}