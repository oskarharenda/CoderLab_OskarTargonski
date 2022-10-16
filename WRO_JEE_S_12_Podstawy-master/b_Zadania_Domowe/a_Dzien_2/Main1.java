package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {
        String result = encode("Miała matka psa");
        System.out.print(result);

    }
    static String encode(String str){
        char[] text = str.toCharArray();
        StringBuilder loop = new StringBuilder();
        String result = "";
        int change = 0;
            for (char value : text){
                value += 3;
                text [change] = value;
                change++;
                loop.append(value);
            }
        result = loop.toString();
        return result;
            }

    }


