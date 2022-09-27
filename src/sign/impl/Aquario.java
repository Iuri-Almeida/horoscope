package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Aquario implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.JANUARY, 21);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.FEBRUARY, 18);
    }

    @Override
    public String toString() {
        return "Aquario";
    }
}
