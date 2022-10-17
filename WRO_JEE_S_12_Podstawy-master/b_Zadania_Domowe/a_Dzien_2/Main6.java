package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String result = replaceChar("Oskar", "k", "g");
        System.out.print(result);
    }

    static String replaceChar(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }

}
