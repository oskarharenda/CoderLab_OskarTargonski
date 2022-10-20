package b_Zadania_domowe.a_Dzien_1;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books = new Book[0];
    public User (int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addBook (Book book){
            this.books = Arrays.copyOf(this.books, this.books.length + 1);
            this.books[books.length - 1] = book;
    }
    public String getFirstName() {
        return firstName;
    }

    public Book[] getBooks() {
        return books;
    }
}
