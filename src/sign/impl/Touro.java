package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Touro implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.APRIL, 21);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.MAY, 20);
    }

    @Override
    public String toString() {
        return "Touro";
    }
}
