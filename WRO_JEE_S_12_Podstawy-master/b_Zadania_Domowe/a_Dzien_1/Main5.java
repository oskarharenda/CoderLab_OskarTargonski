package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] task1Array = {2, 3, 4};
        int[] resultTab = append(task1Array);
        System.out.println(Arrays.toString(resultTab));

    }
    static int[] append(int[] arr){
        int [] copyTab = Arrays.copyOf(arr, arr.length * 2);
        int count = 2;
        for (int i = arr.length; i < copyTab.length; i++) {
            copyTab[i] = arr[count];
            count--;
        }
        return copyTab;
        }

    }


