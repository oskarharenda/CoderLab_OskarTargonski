package a_Zadania.a_Dzien_1.c_Metody;

public class Person {
    private String name="Patrycja";
    private String surname= "Harenda";
    private int age = 24;
    private char gender = 'F';

    void setName(String name){
        this.name=name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    void setAge(int age){
        this.age=age;
    }

    void setGender(char gender){
        this.gender = gender;
    }

    String getFullName(){
        return name+" "+surname;
    }
    int getAge(){
        return age;
    }

    void increaseAge(){
        age++;
    }



}
