package b_Zadania_domowe.b_Dzien_2;


import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class User {
    private int id;
    private String firstname;
    private String lastname;
    private Book[] books=new Book[1];


    public User(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public void addBook(Book book){
        books[books.length-1]=book;
        books= copyOf(books,books.length+1);
    }

    public void returnBook(Book book){
        book.setAvailable(true);
        for(int i=0; i<books.length; i++){
            if(books[i]==book){
                books[i]=books[i+1];
            }
            books= copyOf(books,books.length-1);
        }
    }

    public void returnAllBooks(){
        for(int i=0; i<books.length; i++){
            books[i].setAvailable(true);
            books[i]=null;
        }
        books= copyOf(books,0);
    }
}
