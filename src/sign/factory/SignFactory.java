package sign.factory;

import sign.*;
import sign.impl.*;

import java.time.MonthDay;
import java.util.*;

public class SignFactory {

    private final static List<Sign> signs = Arrays.asList(
        new Aquario(),
        new Peixes(),
        new Aries(),
        new Touro(),
        new Gemeos(),
        new Cancer(),
        new Leao(),
        new Virgem(),
        new Libra(),
        new Escorpiao(),
        new Sagitario(),
        new Capricornio()
    );

    public Sign create(MonthDay date) {
        for (Sign sign : signs) {
            if (!(date.isBefore(sign.getStartDate()) || date.isAfter(sign.getEndDate()))) {
                return sign;
            }
        }
        throw new RuntimeException("Wasn't able to find a sign with the date = " + date.getMonth() + "/" + date.getDayOfMonth());
    }

}
