package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main1 {

    public static void main(String[] args) {
        AccessModifier testAtribute = new AccessModifier();
        testAtribute.publicAtribute = "atrybut publiczny";
        testAtribute.protectedAtribute = "atrybut chroniony"; //klasa znajduje się e tym samym projekcie
        //  testAtribute.privateAtribute = "atrybut prywatny"; // Brak dostepny private!!!
        testAtribute.defaultAtribute = "atrybut domyślny";

        

    }
}
