package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {
    public Calculator() {
        mathTable = new String[0];
    }

    private int num1;
    private int num2;
    private double result;
    private String mathTableLines;
    private static String[] mathTable;

    public double add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 + num2;
        mathTableLines = "added" + num1 + "to" + num2 +
                "got" + result;
        history(mathTableLines);
        return result;
    }

    public double multiply(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 * num2;
        mathTableLines = "multiplied" + num1 + "with" +
                num2 + "got" + result;
        history(mathTableLines);
        return result;
    }

    public double subtract(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 - num2;
        mathTableLines = "subtrackted" + num1 + "from" +
                num2 + "got" + result;
        history(mathTableLines);
        return result;
    }

    public double divide(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 / num2;
        mathTableLines = "divided" + num1 + "by" +
                num2 + "got" + result;
        history(mathTableLines);
        return result;
    }

    public static void history(String historyLine) {
        mathTable = Arrays.copyOf(mathTable, mathTable.length + 1);
        mathTable[mathTable.length - 1] = historyLine;
    }

    public static String[] getTable() {
        return mathTable;
    }

    public void printOperations() {
        System.out.println(Arrays.toString(mathTable));
    }

    public void clearOperations() {
        String[] clear = new String[0];
        mathTable = Arrays.copyOf(clear, 0);
    }
}
