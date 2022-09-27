package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Virgem implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.AUGUST, 23);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.SEPTEMBER, 22);
    }

    @Override
    public String toString() {
        return "Virgem";
    }
}
