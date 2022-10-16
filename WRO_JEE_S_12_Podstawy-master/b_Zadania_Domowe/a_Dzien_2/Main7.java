package b_Zadania_Domowe.a_Dzien_2;

public class Main7 {

    public static void main(String[] args) {
        String result = censor("dupa sos os nie dupa tak d00pa", new String[]{"dupa", "d00pa"});
        System.out.print(result);

    }

    static String censor(String str, String[] words) {
        String[] parts = str.split(" ");
        int count = 0;
        for (int j = 0; j < parts.length; j++) {
            for (int i = 0; i < words.length; i++) {
                if (parts[j].equals(words[i])) {
                    parts[j] = "****";
                }
            }
        }
        StringBuilder loop = new StringBuilder();
        for (String k : parts){
            loop.append(k);
        }
        return loop.toString();
    }
}
