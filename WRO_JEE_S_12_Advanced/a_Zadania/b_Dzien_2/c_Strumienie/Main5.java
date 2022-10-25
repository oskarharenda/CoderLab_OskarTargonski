package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main5 {
    public static String wordReverse(String toRevers){
        StringBuilder reversed = new StringBuilder();
        reversed.append(toRevers);
        reversed.reverse();
        return reversed.toString();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("oskar","patrycja","napis","komputer","telewizor","tablica");
        Map<String,String> map = new HashMap<>();
        map=list.stream().collect(Collectors.toMap(e->e,Main5::wordReverse));
        System.out.println("\nMapa:");
        System.out.println(map);
    }
}
