package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        char[] text = str.toCharArray();
        char check = text[text.length - 2];
        System.out.print(check);
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == 'a') {
                count++;
            }
        }

        System.out.print(count);
    }
}
