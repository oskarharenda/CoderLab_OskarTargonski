package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {
    public int id;
    public String firstname;
    public String lastname;
    public double wage;

    public Employee(int id, String firstname, String lastname, double wage) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.wage = wage;
    }
    public void raiseWage(double percent){
        if(percent>0){
            wage=((100+percent)/100)*wage;
        }else System.out.println("wartość poniżej zera");
    }
}
