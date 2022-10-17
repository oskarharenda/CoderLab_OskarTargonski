package a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Main4 {

    public static void main(String[] args) {
        String str = "Pod Tok kot dOasfp";
        String strDeleteSpace = StringUtils.deleteWhitespace(str);
        String lowerCase = StringUtils.lowerCase(strDeleteSpace);
        String reverse = StringUtils.reverse(lowerCase);
        if (Objects.equals(lowerCase, reverse)) {
            System.out.print("Jest palindromem");
        } else {
            System.out.print("Nie jest palindromem");
        }

    }


}
