package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,13,14,15,19,20,25,28,34,55,12,11);
        printList(numbers,new IntegerFilter(), new Transform<Integer, Integer>() {
            @Override
            public Integer transform(Integer integer) {
                return integer-1;
            }
        });
    }
}
