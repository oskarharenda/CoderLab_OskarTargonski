package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class HourlyEmployee extends Employee {
    public HourlyEmployee(int id, String firstname, String lastname, double wage) {
        super(id, firstname, lastname, wage);
    }
    public double calculatePayment(double hours){
        return hours*wage;
    }
}
