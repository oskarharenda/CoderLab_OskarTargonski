package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    public static void main(String[] args) {
        int result = factorial(9);
        System.out.print(result);

    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int adder = 1;
            for (int i = 1; i <= n; i++) {
                adder = adder * i;
            }
            return adder;
        }
    }
}
