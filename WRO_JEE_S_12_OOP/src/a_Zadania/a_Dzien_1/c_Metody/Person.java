package a_Zadania.a_Dzien_1.c_Metody;

public class Person {
    public Person (){
        System.out.println("test");
    }
    private String name = "Oskar";
    private String surname = "Targ";
    private int age = 26;
    private char gender = 'm';

    public Person setName (String name){
        this.name = name;
        return this;
    }
    public Person setSurname (String surname){
        this.surname = surname;
        return this;
    }
    public Person setAge (int age){
        this.age = age;
        return this;
    }
    public Person setGender (char gender){
        this.gender = gender;
        return this;
    }
    public String getFullName (){
        return name + " " + surname;
    }
    public int increaseAge (){
        return age ++;
    }

    Person p = new Person();
}
