package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {
    public static final double maxHours = 190;
    public SalariedEmployee(int id, String firstname, String lastname, double wage) {
        super(id, firstname, lastname, wage);
    }
    public double calculatePayment(){
        return maxHours*wage;
    }
}
