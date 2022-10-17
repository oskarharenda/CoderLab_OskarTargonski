package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main1 {

    public static void main(String[] args) {
        try{
            factorial(-1);
        } catch (Exception e){
            System.out.print("Error occurred ");
        }
    }

    static int factorial(int number) throws Exception {
        if(number < 1){
            throw new IllegalArgumentException("oskar message");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
