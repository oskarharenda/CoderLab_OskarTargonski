package b_Zadania_Domowe.b_Dzien_2;

public class Main1 {
    public static void main(String[] args) {
        FilterEx1<Integer> x = a -> a<100 && a>0;
        System.out.println(x.check(-123));
    }
}
