package a_Zadania.b_Dzien_2.c_Strumienie;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    /*
    imię, nazwisko, płeć, data urodzenia, wysokość wynagrodzenia
     */
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfBirth;
    private double salary;

    public Employee(String name, String surname, String gender, LocalDate dateOfBirth, double salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public void raiseSalary(int procent){
        salary *= (1 + procent/100.0);
    }

    public long getAge() {
        return ChronoUnit.YEARS.between( dateOfBirth, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + getAge() +
                ", salary=" + salary +
                '}';
    }
}