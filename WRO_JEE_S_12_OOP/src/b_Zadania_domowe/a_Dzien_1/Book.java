package b_Zadania_domowe.a_Dzien_1;

public class Book {
    private int id;
    private String title;
    private boolean availible = true;
    private Author author;
    private Author[] additionalAuthors;
    private User currentUser;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public void setId(int idSetter) {
        this.id = idSetter;
    }

    public void setTitle(String titleSetter) {
        this.title = titleSetter;
    }

    public void setAvailible(boolean availibleSetter) {
        this.availible = availibleSetter;
    }

    public void setAuthor(Author authorSetter) {
        this.author = authorSetter;
    }

    public void setAdditionalAuthors(Author[] additionalAuthorsSetter) {
        this.additionalAuthors = additionalAuthorsSetter;
    }
    public void setCurrentUser (User currentUser){
        this.currentUser = currentUser;
        this.availible = false;
        currentUser.addBook(this);
    }

    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public boolean getAvailible() {
        return this.availible;
    }
    public Author[] getAdditionalAuthors() {
        return this.additionalAuthors;
    }
    public User getCurrentUser(){
        System.out.println(currentUser.getFirstName());
        return this.currentUser;
    }

}
