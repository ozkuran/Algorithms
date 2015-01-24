package com.ozkuran.algorithms.time.calendarday;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @version 0.0.2.13
 * Created by MahmutAli on 11/9/2010.
 * Last Update by MahmutAli on 1/24/2015.
 * Returns if given number is a Prime Number
 */

public class CalendarDay {
    public Date calendarDay (long julianDay){
        Date cDate = new Date();

        long f = julianDay + 1401 + (((4 * julianDay + 274277) / 146097) * 3) / 4 - 38;
        long e = 4 * f + 3;
        long g = (e % 1461) / 4;
        long h = (5 * g) + 2;
        int D = (int) (((h % 153) / 5) + 1);
        int M = (int) ((((h / 153) + 2) % 12) + 1);
        int Y = (int) ((e / 1461) - 4716 + ((12 + 2 - M) / 12));

        GregorianCalendar gc = new GregorianCalendar(Y,M - 1,D);
        cDate = gc.getTime();
        return cDate;
    }
}
