package com.ozkuran.algorithms.math.chebyshevdistance;

/**
 * @version 0.1.6
 * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Calculates Squared Distance
 */
public class ChebyshevDistance {
    public double chebyshevDistance(double x1, double y1, double x2, double y2){
        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
    }
}
