package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main5 {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("xcs");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);

        }
            System.out.println("test");

    }

}
