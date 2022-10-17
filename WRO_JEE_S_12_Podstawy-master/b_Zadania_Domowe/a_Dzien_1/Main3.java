package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        int[] resultTab = minimum(task1Array);
        System.out.println(Arrays.toString(resultTab));
    }

    static int[] minimum(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            result[i] = arr[i][0];
        }
        return result;

    }
}
