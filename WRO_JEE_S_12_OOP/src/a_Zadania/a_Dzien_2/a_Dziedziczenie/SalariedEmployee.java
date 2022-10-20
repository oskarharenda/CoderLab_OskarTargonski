package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class SalariedEmployee extends Employee{
    private final int hours = 190;
    public SalariedEmployee(int id, String firstName, String lastName, int wage) {
        super(id, firstName, lastName, wage);
    }
    public double calculatePayment(){
        return wage * hours;

    }
}
