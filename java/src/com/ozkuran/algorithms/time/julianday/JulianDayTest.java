package com.ozkuran.algorithms.time.julianday;

import junit.framework.TestCase;

public class JulianDayTest extends TestCase {

    public void testConvertDayMonthYearToJulianDay() throws Exception {
        JulianDay jd = new JulianDay();
        long jday = jd.julianDay(24,1,2015);
        assertEquals(jday, 2457047);
    }

    public void testConvertDayMonthYearHourMinuteSecondToJulianDay() throws Exception {
        JulianDay jd = new JulianDay();
        double jday = jd.julianDay(24,1,2015,0,0,0);
        assertEquals(jday, 2457046.5);

    }
}