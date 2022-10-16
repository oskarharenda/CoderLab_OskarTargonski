package b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {
        boolean check = divisibleBy(28, 3);
        System.out.print(check);

    }

    static boolean divisibleBy(int a, int b) {
        boolean checker;
        if (a % b == 0) {
            checker = true;

        } else {
            checker = false;
        }
        return checker;
    }

}
