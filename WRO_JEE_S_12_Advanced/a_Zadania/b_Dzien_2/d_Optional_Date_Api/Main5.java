package a_Zadania.b_Dzien_2.d_Optional_Date_Api;

import java.time.LocalDate;
import java.time.Month;

public class Main5 {
    public static void main(String[] args) {

        for (int i =2019; i<=2024; i++){
            LocalDate date = LocalDate.of(i, Month.DECEMBER, 24);
            System.out.println(date+": "+date.getDayOfWeek());
        }

    }
}
