package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {
        double dogHumanAge = dogAge(1.5);
        System.out.print(dogHumanAge);

    }

    static double dogAge(double dogAge) {
        double Age = 0;
            if (dogAge <= 2) {
                Age = dogAge * 10.5;
            } else {
                Age = (dogAge - 2) * 4 + 21;
            }

        return Age;

    }
}