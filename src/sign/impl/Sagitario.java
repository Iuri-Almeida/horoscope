package sign.impl;

import sign.Sign;

import java.time.Month;
import java.time.MonthDay;

public class Sagitario implements Sign {

    @Override
    public MonthDay getStartDate() {
        return MonthDay.of(Month.NOVEMBER, 22);
    }

    @Override
    public MonthDay getEndDate() {
        return MonthDay.of(Month.DECEMBER, 21);
    }

    @Override
    public String toString() {
        return "Sagitario";
    }
}
