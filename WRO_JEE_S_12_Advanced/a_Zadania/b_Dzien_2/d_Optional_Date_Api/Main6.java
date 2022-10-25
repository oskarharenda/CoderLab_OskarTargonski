package a_Zadania.b_Dzien_2.d_Optional_Date_Api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        Map<String,LocalTime> timeMap = getMapTime();
        System.out.println(timeMap);
    }
    public static Map<String, LocalTime> getMapTime(){
        return ZoneId.getAvailableZoneIds().stream()
                .collect(
                        Collectors.toMap(
                                zone -> zone,
                                zone -> LocalTime.now(ZoneId.of(zone))
                        )
                );
    }
}
