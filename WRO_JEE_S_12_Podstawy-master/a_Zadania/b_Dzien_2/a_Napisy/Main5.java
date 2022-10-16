package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] text = {"dupa", "dópa", "d00pa"};
        String result = stringFromArray(text);
        System.out.print(result);


    }

    static String stringFromArray(String[] str){
        String result = "";
        for (String s : str){
            result = result.concat(s + " ");
        }

        return result;
    }
}
