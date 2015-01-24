package com.ozkuran.algorithms.math.squareddistance;

/**
 * @version 0.1.5
 * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Calculates Squared Distance
 */

public class SquaredDistance {

    public double squaredDistance(double x1, double y1, double x2, double y2){
        double first = x1 - x2;
        double second = y1 - y2;
        return (first * first) + (second * second);
    }
}
