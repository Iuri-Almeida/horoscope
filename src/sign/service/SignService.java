package sign.service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class SignService {

    public Integer getAge(LocalDateTime localDateTime) {
        return Period.between(localDateTime.toLocalDate(), LocalDate.now()).getYears();
    }

    public boolean isLeapYear(LocalDateTime localDateTime) {
        return localDateTime.toLocalDate().isLeapYear();
    }

    public String format(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public ZoneOffset timeZone(LocalDateTime localDateTime, String zone) {
        Set<String> zones = ZoneId.getAvailableZoneIds();

        for (String z : zones) {
            if (z.contains(zone)) {
                ZoneId zoneId = ZoneId.of(z);
                return zoneId.getRules().getOffset(localDateTime);
            }
        }

        throw new RuntimeException("Zone not found for zone = " + zone);
    }

}
