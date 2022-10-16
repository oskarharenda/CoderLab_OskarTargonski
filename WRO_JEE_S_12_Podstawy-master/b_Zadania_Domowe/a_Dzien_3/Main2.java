package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {
        String[] test = new String[] {"oskar", "jest", "najlepszy", "w chuj"};
        String result = safeGet(test, 8);
        System.out.println(result);
    }
    static String safeGet(String[] strTab, int index){
        String result = "";
        try {
            result = strTab[index];
            System.out.println (strTab[index]);
            return result;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        return result;
    }


}
