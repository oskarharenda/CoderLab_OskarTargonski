package a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getFullName());
        System.out.println(person.getAge());

        person.setName("Oskar");
        person.setSurname("Harenda");
        person.setAge(25);
        person.setGender('M');

        person.increaseAge();
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        System.out.println(person.toString());


    }
}
