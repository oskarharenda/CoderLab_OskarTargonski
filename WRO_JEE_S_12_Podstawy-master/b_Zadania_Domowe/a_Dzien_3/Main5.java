package b_Zadania_Domowe.a_Dzien_3;


import java.util.NoSuchElementException;

public class Main5 {

    public static void main(String[] args) {
        try {
            int[] table = new int[]{4, 2, 1, 11, 7, 8};
            int result = indexOf(table, 8);
            System.out.print(result);
        } catch (NoSuchElementException e) {
            System.out.print("no such element");
        }


    }

    static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            } else if (i == elements.length - 1) {
                throw new NoSuchElementException();
            }

        }
        return -1;
    }
}