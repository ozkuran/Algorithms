package com.ozkuran.algorithms.time.julianday;

import static java.lang.Math.floor;

/**
 * @version 0.0.2.10
 * Created by MahmutAli on 11/9/2010.
 * Last Update by MahmutAli on 1/24/2015.
 * Returns if given number is a Prime Number
 */

public class JulianDay {
    public long julianDay(int day, int month, int year){
        long jDay = 0;
        long JanOrFeb = (14 - month) / 12;
        long yr = (long) Math.floor(year + 4800 - JanOrFeb);
        long mon = (long) Math.floor(month + (12 * JanOrFeb) - 3);
        jDay = (long) Math.floor(day + (((153 * mon) + 2) / 5) + (365 * yr) + (yr / 4) + (yr / 400) - (yr / 100) - 32045);
        return jDay;
    }

    public double julianDay(int day, int month, int year, double hour, double minute, double second){
        double jDay = 0;
        jDay = ((hour - 12) / 24) + (minute / 1440) + (second / 86400);
        return julianDay(day, month, year) + jDay;
    }
}
