package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t){
        List<T> list= new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                list.add(t.transform(s));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,13,14,15,19,20,25,28,34,55,12,11);
        for(Integer e : create(numbers,new IntegerFilter(),new IntegerTransform())){
            System.out.println(e);
        }
    }
}
