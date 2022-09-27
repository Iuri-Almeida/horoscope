package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Aries implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.MARCH, 21);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.APRIL, 20);
    }

    @Override
    public String toString() {
        return "Aries";
    }
}
