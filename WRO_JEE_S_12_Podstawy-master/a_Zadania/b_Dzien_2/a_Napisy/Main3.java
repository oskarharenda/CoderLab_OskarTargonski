package a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {
    String result = firstHalf("Programowank");
    System.out.print(result);

    }

    static String firstHalf(String str){
        return str.substring(0, str.length() / 2);

    }
}
