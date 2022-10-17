package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 56, 6, 2, 12, 3, 2, 1};
        int[] secondNumbers = {2, 4, 2, 6, 8, 2, 4, 6, 2};
        int[] thirdNumbers = tabMultiple(numbers, secondNumbers);
        System.out.println(Arrays.toString(thirdNumbers));
    }

    static int[] tabMultiple(int[] numbers, int[] secondNumbers) {
        int longer;
        if (numbers.length > secondNumbers.length) {
            longer = numbers.length;
        } else {
            longer = secondNumbers.length;
        }
        int[] result = new int[longer];
        for (int i = 0; i < longer; i++) {
            result[i] = numbers[i] + secondNumbers[i];
        }
        return result;
    }
}

