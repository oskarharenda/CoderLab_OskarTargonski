package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {
    double pi = 3.14159265;
    public double pow(double num1, double num2){
        double result = Math.pow(num1,num2);
        logOperation("powered: " + num1 + " to " + num2 + " got " + (result));
        return result;
    }
    public double sqrt(double num1, double num2){
        double result = Math.pow(num1,(1/num2));
        if(num1<0){
            throw new IllegalArgumentException("Brak rozwiązań w zbiorze liczb rzeczywistych");
        }
        else{
            logOperation("sqrt: " + num1 + " to " + num2 + " got " + (result));
        }
        return result;
    }
    public double computeCircleArea(double r){
        return pi*r*r;
    }

}
