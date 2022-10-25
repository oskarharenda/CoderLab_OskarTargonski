package a_Zadania.b_Dzien_2.d_Optional_Date_Api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main4 {
    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("java"), Optional.empty(), Optional.of("python"), Optional.of("php"), Optional.empty(), Optional.of(""));
        listOfOptionals.stream()
                //.filter(s->s.equals(Optional.empty())).forEach(System.out::println);
                .filter(s->!s.equals(Optional.of("")))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
