package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        Predicate predicate = o -> {
            if(o instanceof String){
                System.out.println("To jest String: "+o);
                return true;
            } return false;
        };

        predicate.test("abc");
        predicate.test(123);
    }


}
