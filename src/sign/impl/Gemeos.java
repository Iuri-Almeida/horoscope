package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Gemeos implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.MAY, 21);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.JUNE, 20);
    }

    @Override
    public String toString() {
        return "Gemeos";
    }
}
