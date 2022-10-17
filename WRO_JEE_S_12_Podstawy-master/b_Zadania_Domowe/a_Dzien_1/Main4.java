package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        int[] resultTab = lessMore(task1Array);
        System.out.println(Arrays.toString(resultTab));

    }

    static int[] lessMore(int[][] arr) {
        int[] tab = new int[2];
        double average = 0;
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                average = average + arr[i][j];
                counter++;
            }

        }
        average = average / counter;
        System.out.print(average);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (average > arr[i][j]) {
                    tab[0]++;
                } else if (average < arr[i][j]){
                    tab[1]++;
                }

            }
        }
        return tab;
    }
}
