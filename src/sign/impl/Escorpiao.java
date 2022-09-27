package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Escorpiao implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.OCTOBER, 23);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.NOVEMBER, 21);
    }

    @Override
    public String toString() {
        return "Escorpiao";
    }
}
