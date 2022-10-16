package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
    String OddEvencheck = checkEvenOdd (7);
    System.out.print (OddEvencheck);

    }

    static String checkEvenOdd(int check) {
        if (check % 2 == 0) {
            return "odd";
        } else
        {
            return "even";
        }
    }
}

