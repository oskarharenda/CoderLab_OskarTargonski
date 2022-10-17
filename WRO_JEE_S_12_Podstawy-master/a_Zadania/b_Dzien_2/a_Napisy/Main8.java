package a_Zadania.b_Dzien_2.a_Napisy;

import static java.lang.Character.*;

public class Main8 {

    public static void main(String[] args) {
        String result = toggleChar("oSkAr");
        System.out.print(result);

    }

    static String toggleChar(String str) {
        char[] text = str.toCharArray();
        String result = "";
        int count = 0;
        for (char s : text) {
        //for (int i = 0; i < text.length; i++) {
            char check = str.charAt(count);
            if (Character.isLowerCase(check)) {
                result = result + String.valueOf(s).toUpperCase();
            } else{
                result = result + String.valueOf(s).toLowerCase();
            }
            count++;
        }
        return result;
    }
}




