package a_Zadania.a_Dzien_1.c_Tablice;


public class Main4 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 1, 12, 4, 1, 20, 5};
        int[] revers = new int[10];
        for (int i = 0; i < 10; i++) {
            revers[revers.length - i - 1] = numbers[i];
        }
        for (int count : revers) {
            System.out.println(count);
        }
    }
}
