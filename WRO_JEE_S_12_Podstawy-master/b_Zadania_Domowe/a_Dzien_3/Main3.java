package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
    int result = getLength(null);
    System.out.println(result);

    }
    static int getLength(String str){
        int counter = -1;
        try{
            counter = str.length();
        }
        catch (NullPointerException e){
            System.out.println("invalid input");
        }
        return counter;
    }


}
