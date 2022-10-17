package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String result = replaceChar("Oskar", 'k', 'g');
        System.out.print(result);


    }
    static String replaceChar(String str, char forReplace, char replacement){
        return str.replaceAll(Character.toString(forReplace), Character.toString(replacement));
    }

}
