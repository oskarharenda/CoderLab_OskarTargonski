package b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4, 2, 1, 3, 1}, {3, 5, 1, 1, 3, 2, 1}};
        int sum2 = oddSum(task1Array);
        System.out.print(sum2);

    }
    static int oddSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j = j + 2){
                if (j % 2 == 0){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
