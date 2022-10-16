package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {

    String str = "codersLabxyz";
    char [] text = str.toCharArray();
        int count = 1;
        char [] result = new char[text.length];
        for (char s : text){
            //for (int i = 0; i < text.length; i++){
            result[result.length - count] = s;
            count++;
        }
        System.out.print(result);

    }

}
