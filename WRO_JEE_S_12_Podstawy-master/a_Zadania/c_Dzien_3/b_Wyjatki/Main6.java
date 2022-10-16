package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try {
            int result = divide(4, 3);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie dziel przez 0");
        }
        int c = a / b;
        return c;
    }

}
