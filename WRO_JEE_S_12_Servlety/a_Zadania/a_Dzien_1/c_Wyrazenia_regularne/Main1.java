package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(verifyEmail("oskarharenda@gmail.com"));
        System.out.println(verifyEmail("oskarharendagmail.com"));
        System.out.println(verifyEmail("@gmail.com"));
        System.out.println(verifyEmail("oskarharenda@com"));

    }

    static boolean verifyEmail(String email){
        Pattern patter = Pattern.compile("[_a-zA-Z0-9-]+(\\.[\n +_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
        return patter.matcher(email).matches();
    }

}
