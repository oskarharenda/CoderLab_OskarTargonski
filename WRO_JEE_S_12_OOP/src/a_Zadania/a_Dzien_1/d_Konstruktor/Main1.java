package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("Oskar",
                "Targoński");
        person.fullName();
        Person person1 = new Person("Oskar", 26);
        person1.fullName();
        Person person2 = new Person("Oskar", "Targoński", 26, 'm');
        person2.fullName();
    }
}