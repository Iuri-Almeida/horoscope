package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Peixes implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.FEBRUARY, 19);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.MARCH, 20);
    }

    @Override
    public String toString() {
        return "Peixes";
    }
}
