package b_Zadania_Domowe.b_Dzien_2;

public class Main3 {
    public static void main(String[] args) {
        String sampleTex="SAmpletext";
        Function<String> name =e->e.substring(2,e.length()-2);
        System.out.println(name.metoda(sampleTex));
    }
}
