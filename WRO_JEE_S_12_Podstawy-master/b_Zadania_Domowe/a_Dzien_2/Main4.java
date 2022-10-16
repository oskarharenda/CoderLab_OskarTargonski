package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {
        int result = tripple("saaagoisbbb");
        System.out.print(result);

    }

    static int tripple(String str) {
        char text[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < text.length - 2; i++) {
            if (text.length - i == 2){
                break;
            }
            if (text[i] == text[i + 1] && text[i] == text[i + 2]) {
                count++;
            }
        }
    return count;
    }

}
