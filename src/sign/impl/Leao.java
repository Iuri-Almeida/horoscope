package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Leao implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.JULY, 23);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.AUGUST, 22);
    }

    @Override
    public String toString() {
        return "Leao";
    }
}
