package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Capricornio implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.DECEMBER, 22);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.JANUARY, 20);
    }

    @Override
    public String toString() {
        return "Capricornio";
    }
}
