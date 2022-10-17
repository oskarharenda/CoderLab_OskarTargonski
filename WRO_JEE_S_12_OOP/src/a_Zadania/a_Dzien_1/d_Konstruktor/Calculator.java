package a_Zadania.a_Dzien_1.d_Konstruktor;

import com.sun.source.tree.NewArrayTree;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class Calculator {
    private String[] history;

    public Calculator() {
        history = new String[0];
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        logOperation("Added " + num1 + " and " + num2 + " got " + result);
        return result;
    }

    public double multiply(double num1, double num2) {
        logOperation("Mul " + num1 + " by " + num2 + " got " + (num1 * num2));
        return num1 * num2;
    }

    public double subtract(double num1, double num2) {
        logOperation("Sub " + num2 + " from " + num1 + " got " + (num1 - num2));
        return num1 - num2;
    }

    public double divide(double num1, double num2) throws IllegalArgumentException {
        if (num2 != 0) {
            logOperation("Divided " + num1 + " by " + num2 + " got " + (num1 / num2));
            return num1 / num2;
        } else {
            logOperation("Divided " + num1 + " by " + num2 + " got ERROR");
            throw new IllegalArgumentException("Num2 nie może być == 0");
        }
    }

    public void printOperations() {
        System.out.println("Historia:");
        for (int i = 0; i < history.length; i++) {
            System.out.println((i + 1) + ": " + history[i]);
        }
    }

    public void clearOperations() {
        history = new String[0];
    }

    protected void logOperation(String operation) {
        history = Arrays.copyOf(history, history.length + 1);
        history[history.length - 1] = operation;

        logGlobalOperation(operation);
    }


    // --------------------------------------------------------------------------------

    private static String[] globalHistory = new String[0];

    protected void logGlobalOperation(String operation) {
        globalHistory = Arrays.copyOf(globalHistory, globalHistory.length + 1);
        globalHistory[globalHistory.length - 1] = operation;
    }

    public static void printGlobalOperations() {
        System.out.println("Globalna historia:");
        for (int i = 0; i < globalHistory.length; i++) {
            System.out.println((i + 1) + ": " + globalHistory[i]);
        }
    }
}