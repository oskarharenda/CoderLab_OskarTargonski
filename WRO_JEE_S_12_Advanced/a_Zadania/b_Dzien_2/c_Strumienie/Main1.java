package a_Zadania.b_Dzien_2.c_Strumienie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("salsa","Salami","auto","krzesło","podłoga","salsa","oskar", "ma");
        words.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List <String> fiveLetterWords = words.stream()
                .filter(s->s.length()==5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(fiveLetterWords);

        String result = words.stream()
                .map(s->s.length() >=3 ? s.substring(0,3) : s)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
