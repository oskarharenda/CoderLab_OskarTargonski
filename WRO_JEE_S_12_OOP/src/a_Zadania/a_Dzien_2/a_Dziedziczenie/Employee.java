package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int wage;
    public Employee(int id, String firstName, String lastName, int wage){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }
    public double raiseWage (double percent){
        return (wage * (100 + percent) / 100);
    }
}
