package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        String[] mainTab = new String[50];
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 9 && i < 10) {
                mainTab[i] = "0" + i + ", \n";
            } else if (i % 10 == 9) {
                mainTab[i] = i + ", \n";
            } else if (i < 10) {
                mainTab[i] = "0" + i + ", ";
            } else {
                mainTab[i] = i + ", ";
            }
        }
        for (String s : mainTab){
            System.out.print(s);
        }
        String[] mainTab2 = new String[50];

    }
}
