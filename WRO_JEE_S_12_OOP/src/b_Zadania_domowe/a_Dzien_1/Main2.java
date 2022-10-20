package b_Zadania_domowe.a_Dzien_1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        User user = new User(1234, "Oskar", "Targ");
        Book book = new Book(123, "Tytuł");
        book.setCurrentUser(user);
        System.out.println(book.getAvailible());
        book.getCurrentUser();
        System.out.println(Arrays.toString(user.getBooks()));

    }
}
