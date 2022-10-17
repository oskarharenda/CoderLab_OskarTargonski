package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main3 {

    public static void main(String[] args) {
    int text = countTokens(" To jest tekst do piosenka");
    System.out.print(text);

    }
    static int countTokens(String str){
        //String trim = str.trim();
        String[] parts = str.split(" ");
        return parts.length;

    }

}