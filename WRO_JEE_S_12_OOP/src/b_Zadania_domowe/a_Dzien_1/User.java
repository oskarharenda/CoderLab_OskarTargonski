package b_Zadania_domowe.a_Dzien_1;


import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class User {
    private int id;
    private String firstname;
    private String lastname;
    private Book[] books=new Book[0];

    public User(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
     public void addBook(Book book){
        books[books.length-1]=book;
        books= copyOf(books,books.length+1);
     }

}
