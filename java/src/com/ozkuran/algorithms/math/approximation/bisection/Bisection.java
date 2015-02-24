package com.ozkuran.algorithms.math.approximation.bisection;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import com.ozkuran.algorithms.math.*;
import com.ozkuran.algorithms.math.calculatepolynomial.CalculatePolynomial;

import static java.lang.Math.*;

/**
 * @version 0.1.13
 * Created by MahmutAli on 12/2/2009.
 * Last Update by MahmutAli on 2/24/2015.
 * Calculates Approximation of a Polynomial using Bisection Algorithm
 */
public class Bisection {
    private List<Double> _polynomial;
    private int _maxIteration;
    private Double _tolerance;
    private int _currentIteration;


    public Double calculate(){
        return calculate(-100000.0,100000.0);
    }

    private Double calculate(Double small, Double big){
        CalculatePolynomial cp = new CalculatePolynomial();

        if(small >= big ){
            throw new IllegalArgumentException("Small guess is not smaller than big guess");
        }
        if (signum(cp.calculate(_polynomial, small)) == signum(cp.calculate(_polynomial, big))){
            throw new IllegalArgumentException("_polynomial(small) and _polynomial(small) have the same sign");
        }

        if (abs(cp.calculate(_polynomial, small)) < _tolerance){
            return small;
        }

        if (abs(cp.calculate(_polynomial, big)) < _tolerance){
            return big;
        }

        Double mid = (small + big) / 2;

        if ((abs(cp.calculate(_polynomial, small)) < _tolerance) || (abs(cp.calculate(_polynomial, big)) < _tolerance))
            return mid;
        if (signum(cp.calculate(_polynomial, small)) == signum(cp.calculate(_polynomial, big))){
            small = mid;
        }
        else {
            big = mid;
        }

        return calculate(small,big);
    }


    public Bisection(List<Double> polynomial, int maxIterations, Double tolerance) {
        _polynomial = polynomial;
        _maxIteration = _maxIteration;
        _tolerance = tolerance;
        _currentIteration = 0;
    }
}
