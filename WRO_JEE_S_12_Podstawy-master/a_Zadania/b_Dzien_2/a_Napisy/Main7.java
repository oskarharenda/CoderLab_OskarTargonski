package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota";
        String str2 = str.replaceAll(" ", "");
        String str2Low = str2.toLowerCase();
        char[] text = str2Low.toCharArray();
        char[] result = new char[text.length];
        int count = 1;

        for (char s : text) {
            result[result.length - count] = s;
            count++;
        }
        System.out.println(text.equals(result));
        System.out.println(result);
        System.out.println(text);
    }
}
