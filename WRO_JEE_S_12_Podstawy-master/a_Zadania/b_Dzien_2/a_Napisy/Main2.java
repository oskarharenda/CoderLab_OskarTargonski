package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {
        int result = charPos("Oskqarqq", 'q');
        System.out.print(result);

    }

    static int charPos(String str, char c) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == c) {
                return i;
            }

        }
        return -1;

    }
}