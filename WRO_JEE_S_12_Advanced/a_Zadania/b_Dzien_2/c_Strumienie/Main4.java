package a_Zadania.b_Dzien_2.c_Strumienie;

import java.lang.invoke.ConstantCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("oskar","patrycja","napis","komputer","telewizor","tablica");
        list.stream()
                .map(n-> n.length()).forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);
        System.out.println("zawiera \"n\":");
        list.stream().filter(l-> l.contains("n")).forEach(System.out::println);
        System.out.println("\nsuma:");
        int sum=list.stream().mapToInt(n-> n.length()).sum();
        System.out.println(sum);
        System.out.println("\n3 posortowane alfabetycznie:");
        list.stream().sorted().limit(3).forEach(System.out::println);

    }
}
