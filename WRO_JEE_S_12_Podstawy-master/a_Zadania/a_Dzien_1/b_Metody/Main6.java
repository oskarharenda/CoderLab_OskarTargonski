package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    public static void main(String[] args) {
        boolean isMature = checkMaturity(10);
        System.out.print (isMature);

    }

    static boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

