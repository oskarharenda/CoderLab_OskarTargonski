package b_Zadania_domowe.b_Dzien_2;

public class SoundBook extends Book{
    double dauration;
    int numberOfCarriers;

    public SoundBook(int id, String title, Author author, Author[] additionalAuthor) {
        super(id, title, author, additionalAuthor);
    }
}
