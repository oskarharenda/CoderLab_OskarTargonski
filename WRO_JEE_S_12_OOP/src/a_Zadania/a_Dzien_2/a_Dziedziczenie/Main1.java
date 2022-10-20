package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;
import a_Zadania.a_Dzien_1.d_Konstruktor.Person;

import static java.lang.Math.pow;

public class Main1 {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(AdvancedCalculator.root(729, 3));
    }
}