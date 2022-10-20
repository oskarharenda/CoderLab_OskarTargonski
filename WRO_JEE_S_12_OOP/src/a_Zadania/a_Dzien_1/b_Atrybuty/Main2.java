package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main2 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = "test1";
        System.out.print(testAttribute.protectedAttribute);
        testAttribute.publicAttribute = "test2";
        System.out.print(testAttribute.publicAttribute);
    }
}
