package a_Zadania.b_Dzien_2.c_Strumienie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(
                new Employee("Jan", "Kowalski", "male", LocalDate.of(1990, 1, 1), 3500)
        );
        employees.add(
                new Employee("Adam", "Nowak", "male", LocalDate.of(1990, 1, 1), 3500)
        );
        employees.add(
                new Employee("Anna", "Kowalska", "female", LocalDate.of(1990, 3, 11), 3500)
        );
        employees.add(
                new Employee("Barba", "Nowak", "female", LocalDate.of(2000, 1, 1), 1000)
        );
        employees.add(
                new Employee("Celina", "Janusz", "female", LocalDate.of(1990, 1, 1), 3500)
        );
        System.out.println("osoby nazwisko na literę N");
        employees.stream()
                .filter( e -> e.getSurname().startsWith("N"))
                .forEach(System.out::println);
        System.out.println("osoby w wieku 30 a 45 lat");
        employees.stream()
                .filter( e -> e.getAge() >= 30 )
                .filter( e -> e.getAge() <= 45 )
                .forEach(System.out::println);
        System.out.println("podwyżka dla kobiet w wieku 20 a 30 lat, <= 3500");
        employees.stream()
                .filter(e -> e.getGender().equals("female"))
                .filter(e -> e.getAge() >= 20 && e.getAge() <= 30)
                .peek( e -> e.raiseSalary(5))
                .forEach(System.out::println);

    }
}