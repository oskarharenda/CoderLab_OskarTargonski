package a_Zadania.d_Dzien_4.d_External_jar;


public class Main3 {

    public static void main(String[] args) {
    String [] table = new String[] {"test", "jeden", "dwa", "trzy"};
    String result = stringFromArray(table);
    System.out.print(result);
    }
    static String stringFromArray(String[] str){
        StringBuilder loop = new StringBuilder();
        for (String s : str){
            loop.append(s);
        }
        return (loop.toString());
    }


}
