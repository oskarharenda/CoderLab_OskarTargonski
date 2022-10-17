package b_Zadania_domowe.b_Dzien_2;


public class Author extends Person{

    private String nickname;

    public Author(int id, String name, String surname, String nickname) {
        this.id = id;
        this.firstname = name;
        this.lastname = surname;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + firstname + '\'' +
                ", surname='" + lastname + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
