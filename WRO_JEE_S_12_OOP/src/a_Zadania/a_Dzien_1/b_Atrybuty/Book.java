package a_Zadania.a_Dzien_1.b_Atrybuty;

public class Book {
    private String name = "Wladca pierscieni";
    private int catalogNumber = 123;

    public String getName() {
        return name;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getBookInfo() {
        return "Hej, jestem ksiazką: " + this.name + "; Mój numer to :" + this.catalogNumber;
    }
}
