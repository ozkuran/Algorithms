package com.ozkuran.algorithms.time.calendarday;

import junit.framework.TestCase;

import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDayTest extends TestCase {

    public void testCalendarDayGivenJulianDay() throws Exception {
        CalendarDay cd = new CalendarDay();
        Date d = cd.calendarDay(2457047);
        GregorianCalendar gc = new GregorianCalendar(2015,0,24);
        Date e = gc.getTime();
        assertEquals(d, e);
    }
}