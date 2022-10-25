package b_Zadania_Domowe.a_Dzien_1.additional;

public class Test {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void printValue() {
                System.out.println("A");
            }
        };
        a1.printValue();
    }
}
