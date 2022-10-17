package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {
    int result = toInt("asd");
    System.out.println(result);

    }
    static int toInt(String str){
        int num = -1;
        try {
        num = Integer.parseInt(str);}
        catch (NumberFormatException e){
            System.out.println("invalid input");
        }
    return num;
    }


}
