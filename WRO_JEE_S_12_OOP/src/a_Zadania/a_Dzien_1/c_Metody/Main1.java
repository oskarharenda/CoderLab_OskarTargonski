package a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Maciek");
        person.setSurname("Kłosz");
        person.setAge(32);
        person.setGender('m');
        System.out.println(person.getFullName());
        person.increaseAge();

        Car car = new Car();
        car.setBrand("honda");
        car.setModel("civic");
        car.setPrice(40000);
        System.out.println(car.getPrice());

    }
}
