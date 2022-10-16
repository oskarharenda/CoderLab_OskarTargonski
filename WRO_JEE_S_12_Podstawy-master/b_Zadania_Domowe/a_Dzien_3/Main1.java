package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
    average("5", "0");

    }static void average(String a, String b){
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int result = 0;
        try {
            result = first / second;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Nie dziel przez 0!");
        }
        System.out.println("test");
    }



}
