package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(verifyEmail("32"));
    }



    static boolean verifyEmail(String email){
        Pattern patter = Pattern.compile("\\d");
        return patter.matcher(email).matches();
    }

}
