package b_Zadania_domowe.b_Dzien_2;

public class Test {
    public static void main(String[] args) {
        Author author1 = new Author(1,"J.K.","Rowling","-");
        Book book1 = new Book(1,"Harry Potter",author1);
        User user1 = new User(1,"Oskar","Harenda");

        user1.addBook(book1);
        System.out.println(book1.toString());


    }
}
