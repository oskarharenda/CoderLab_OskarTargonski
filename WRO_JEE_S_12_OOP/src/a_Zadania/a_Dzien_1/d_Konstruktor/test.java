package a_Zadania.a_Dzien_1.d_Konstruktor;

public class test {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(2,5);
        calculator.multiply(2,5);

        System.out.println();
        calculator.subtract(34,0);

        Calculator.printGlobalOperations();
    }
}
