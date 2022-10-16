package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        String[] result = onlyTwoElements("Java-zadania-podzial-napisow", '-');
        System.out.println(Arrays.toString(result));
    }

    static String[] onlyTwoElements(String str, char separator) {
        String[] parts = str.split(Character.toString(separator), 2);
        String[] result = new String[2];
        result[0] = parts[0];
        result[1] = parts[1];/*
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
            sb.append(parts[i]);
        }
        result [1] = sb.toString();*/
        return result;
    }

}


