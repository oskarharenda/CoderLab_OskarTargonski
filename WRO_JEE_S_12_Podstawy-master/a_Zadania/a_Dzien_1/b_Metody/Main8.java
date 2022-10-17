package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {
        int result = maxOfThree (32 ,4, 17);
        System.out.print (result);

    }

    static int maxOfThree(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }
}


