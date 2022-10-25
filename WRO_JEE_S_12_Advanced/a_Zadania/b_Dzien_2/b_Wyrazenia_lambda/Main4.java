package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import javax.swing.text.MutableAttributeSet;

public class Main4 {
    public static void main(String[] args) {
        Mathematics pow = (i1) -> (double)i1*(double)i1;
        Mathematics sqrt = (i1) -> Math.sqrt((double)i1);
        Mathematics factorial = (i1) -> {
            int result =1;
            for (int i=1; i<=(Integer)i1; i++){
                result *=i;
            }return  result;
        };

        System.out.println(pow.count(3.0));
        System.out.println(factorial.count(1));
        System.out.println(factorial.count(0));
    }


}
