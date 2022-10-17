package b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private boolean available =true;
    private Author author;
    private Author[] additionalAuthor;
    private User currentUser;
    private int popularity;

    public void returnBook(){
    }


    public boolean equals(Book book){
        if (this.equals(book)){
            return true;
        }
        else return false;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        available = false;
        currentUser.addBook(this);
    }

    public Book(int id, String title,Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author,Author[] additionalAuthor) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthor = additionalAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAdditionalAuthor() {
        return additionalAuthor;
    }

    public void setAdditionalAuthor(Author[] additionalAuthor) {
        this.additionalAuthor = additionalAuthor;
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                ", author=" + author +
                ", additionalAuthor=" + Arrays.toString(additionalAuthor) +
                ", currentUser=" + currentUser +
                ", popularity=" + popularity +
                '}';
    }
}

