package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

    public static void main(String[] args) {
        String result = encode("Wszystkiegonajlepszego", 4);
        String result2 = decode("[w~}wxomiksrenpitw~iks", 4);
        System.out.print(result + "\n");
        System.out.print(result2);
    }

    static String encode(String str, int shift) {
        char[] text = str.toCharArray();
        StringBuilder loop = new StringBuilder();
        String result = "";
        int change = 0;
        for (char value : text) {
            value += shift;
            text[change] = value;
            change++;
            loop.append(value);
        }
        result = loop.toString();
        return result;
    }

    static String decode(String str, int shift) {
        char[] text = str.toCharArray();
        StringBuilder loop = new StringBuilder();
        String result = "";
        int change = 0;
        for (char value : text) {
            value -= shift;
            text[change] = value;
            change++;
            loop.append(value);
        }
        result = loop.toString();
        return result;

    }
}
