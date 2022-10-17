package b_Zadania_Domowe.a_Dzien_2;
import static java.lang.Character.*;



public class Main3 {

    public static void main(String[] args) {
        String result = upperCase("abcdefghijk", 3);
        System.out.print(result);

    }

    static String upperCase(String str, int index) {
        char[] text = str.toCharArray();
        StringBuilder loop = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            if (i % index == 2 && i > 0) {
                text[i] = toUpperCase(text[i]);
                loop.append(text[i]);
            } else {
                loop.append(text[i]);
            }
        }
        return loop.toString();
    }

}
