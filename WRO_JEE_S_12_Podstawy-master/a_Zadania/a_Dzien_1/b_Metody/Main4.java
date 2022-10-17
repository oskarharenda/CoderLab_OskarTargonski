package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {

        String data = createName ("oskar", "targonski", "kasztan");
        System.out.print (data);


    }
    static String createName (String name, String surname, String nickname){
        return name + " " + nickname + " " + surname;
    }
}
