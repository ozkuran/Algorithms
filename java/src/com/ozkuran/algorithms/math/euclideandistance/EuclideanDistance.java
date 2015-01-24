package com.ozkuran.algorithms.math.euclideandistance;

/**
 * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Calculates Euclidean Distance
 */

public class EuclideanDistance {

    public double euclideanDistance(double x1, double y1, double x2, double y2){
        double first = Math.pow((x1 - x2), 2);
        double second = Math.pow((y1 - y2), 2);
        return Math.sqrt(first + second);
    }
}
