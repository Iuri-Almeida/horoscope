package sign.service;

import java.time.*;
import java.time.format.DateTimeFormatter;

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
        return ZoneId.of(zone).getRules().getOffset(localDateTime);
    }

    public String moonSign(LocalTime time, String zone) {
        if (time.isAfter(LocalTime.of(12, 0, 0)) && zone.contains("Recife")) {
            return "Casimiro";
        }

        if (time.isBefore(LocalTime.of(12, 0, 0)) && zone.contains("Cuiaba")) {
            return "Odin";
        }

        if (zone.contains("Sao_Paulo")) {
            return "Gandalf";
        }

        return "Em construção";
    }

}
