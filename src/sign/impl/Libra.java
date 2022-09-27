package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Libra implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.SEPTEMBER, 23);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.OCTOBER, 22);
    }

    @Override
    public String toString() {
        return "Libra";
    }
}
