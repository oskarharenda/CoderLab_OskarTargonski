package a_Zadania.a_Dzien_1.d_Tablice_wielowymiarowe;

public class Main3 {

    public static void main(String[] args) {

        int[][] task3Array = {{2, 3, 4, 6}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        int result = 0;
        for (int i = 0; i < task3Array.length; i++) {
            for (int j = 0; j < task3Array[i].length; j++) {
                result = result + task3Array[i][j];
            }

        }
        System.out.print(result);

    }
}
