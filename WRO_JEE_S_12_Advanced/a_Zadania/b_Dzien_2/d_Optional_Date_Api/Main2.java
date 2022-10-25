package a_Zadania.b_Dzien_2.d_Optional_Date_Api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
public class Main2 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(zone->zone.contains("Europe"))
                .forEach(zone-> System.out.println(
                        zone + "; "+ LocalTime.now(ZoneId.of(zone))
                ));
    }
}