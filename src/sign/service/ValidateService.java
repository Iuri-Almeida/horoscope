package sign.service;

import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Set;

public class ValidateService {

    public LocalDate readDate(Scanner sc) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(sc.nextLine().strip(), formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Falha lendo o valor digitado.");
        }
    }

    public LocalTime readTime(Scanner sc) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            return LocalTime.parse(sc.nextLine().strip(), formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Falha lendo o valor digitado.");
        }
    }

    public boolean checkUserAnswer(Scanner sc, String txt) {
        return this.validateUserAnswer(sc, txt);
    }

    private boolean validateUserAnswer(Scanner sc, String txt) {
        String answer;
        do {
            new ColorService().purple(txt);
            answer = sc.nextLine().toUpperCase().strip();
        } while (!answer.startsWith("S") && !answer.startsWith("N"));

        return answer.startsWith("S");
    }

    public String readZone(Scanner sc) {
        String s = this.removeAccents(sc.nextLine().strip());
        String newString = s.replace(" ", "_");

        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String zone : zones) {
            if (zone.contains(newString)) {
                return zone;
            }
        }

        throw new IllegalArgumentException("Zone not found for zone = " + s);
    }

    // https://pt.stackoverflow.com/questions/42/como-remover-acentos-e-outros-sinais-gr%C3%A1ficos-de-uma-string-em-java
    private String removeAccents(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

}
