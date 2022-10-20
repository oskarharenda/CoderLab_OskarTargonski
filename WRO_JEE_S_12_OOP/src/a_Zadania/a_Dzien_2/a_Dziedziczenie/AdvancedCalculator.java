package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

import java.util.Arrays;


public class AdvancedCalculator extends Calculator {

    private static final double PI = 3.14159265;

    public static double pow(int num1, int num2) {
        double result = Math.pow(num1, num2);
        String mathTableLines = num1 + "^" + num2 + "equals" + result;
        history(mathTableLines);
        return result;
    }

    public static double root(int num1, int num2) {
        double result = Math.pow(num1, 1.0 / num2);
        String mathTableLines = num1 + "root of" + num2 + "equals" + result;
        history(mathTableLines);
        return result;
    }

    public static double computeCircleArea(double r) {
        double result = PI * r * r;
        String mathTableLines = "Circle area of radius " + r + " is " + result;
        history(mathTableLines);
        return result;
    }

    public static void printGlobalOperations() {
        System.out.println(Arrays.toString(Calculator.getTable()));

    }

    public static void printGlobalOperations(int length) {
        String[] newTable = Arrays.copyOf(Calculator.getTable(), length);
        System.out.println(Arrays.toString(newTable));
    }

    public static void printGlobalOperations(String length) {
        try {
            int length2 = Integer.parseInt(length);
            String[] newTable = Arrays.copyOf(Calculator.getTable(), length2);
            System.out.println(Arrays.toString(newTable));
        } catch (NumberFormatException e) {
            System.out.println("Zły format zapisu liczby");
        }
    }

}
