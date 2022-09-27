package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Cancer implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.JUNE, 21);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.JULY, 22);
    }

    @Override
    public String toString() {
        return "Cancer";
    }
}
