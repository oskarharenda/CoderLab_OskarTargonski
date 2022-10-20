package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;
    public Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person (String name, String surname,
                   int age, char gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public void fullName(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}


