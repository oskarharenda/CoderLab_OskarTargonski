package b_Zadania_domowe.a_Dzien_1;


public class Author {
    private int id;
    private String name;
    private String surname;
    private String nickname;

    public Author(int id, String name, String surname, String nickname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
