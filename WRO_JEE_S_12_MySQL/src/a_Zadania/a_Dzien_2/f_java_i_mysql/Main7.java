package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws SQLException {

        Scanner scanner=new Scanner(System.in);
        String choose ="";
        while (!choose.equals("x")) {
            oskardbutil.printData(oskardbutil.Conetion(), "select * from cinemas", "id", "name", "address");
            System.out.println("e-edycja \n u-usuniecie \n e-exit");
            choose = scanner.nextLine();
            switch (choose){
                case "e": edit();
                break;
                case "u": delete();
                break;
                default: System.out.println("Podana wartość jest nie poprawna!!!");
                break;
            }
        }
    }

    static void edit() throws SQLException {
        System.out.println("Podaj id: ");
        String id="";
        Scanner scanner = new Scanner(System.in);
        id=scanner.nextLine();
        System.out.println("Podaj nową nazwę: ");
        String name=scanner.nextLine();
        System.out.println("Podaj nowy adres: ");
        String address=scanner.nextLine();
        String query="UPDATE cinemas SET name='"+name+"', address='"+address+"' where id="+id;

        insert2(oskardbutil.Conetion(),query);

    }
    public static void insert2(Connection conn, String query) {
        try ( PreparedStatement statement = conn.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj id kina do usunięcia!!!");
        int id =scanner.nextInt();
        System.out.println("Czy na pewno chcesz usunąć? potwierdź \"t\"");
        String yesNo=scanner2.nextLine();
        if(yesNo.equals("t")) {
            oskardbutil.remove(oskardbutil.Conetion(), "cinemas", id);
        }
    }

}
