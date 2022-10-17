package a_Zadania.b_Dzien_2.a_Napisy;

public class Main4 {

    public static void main(String[] args) {
    boolean result = containsStr("RuchAnie", "Anie");
    System.out.print(result);

    }

    static boolean containsStr(String str, String search){
        String check = str.replace(search, "z");
        return check != str;

    }
}
