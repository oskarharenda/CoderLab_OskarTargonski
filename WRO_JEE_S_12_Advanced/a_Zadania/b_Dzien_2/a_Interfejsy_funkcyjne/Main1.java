package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,13,14,15,19,20,25,28,34,55,12,11);
        printList(numbers,new IntegerFilter());
        printList(numbers, new Filter<Integer>() {
            @Override
            public boolean check(Integer a) {
                return a<20;
            }
        });
        printList(numbers,nazwa_zmiennej-> nazwa_zmiennej<20);//lambda
    }
}
