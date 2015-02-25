package com.ozkuran.algorithms.math.calculatepolynomial;

import java.util.Iterator;
import java.util.List;

/**
 * @version 0.0.5
 * Created by MahmutAli on 6/2/2006.
 * Last Update by MahmutAli on 2/25/2015.
 * Calculates given polynomial in given location
 */
public class CalculatePolynomial {

    public CalculatePolynomial(){

    }


    public Double calculate(List<Double> _inputPolynomial, Double x)
    {
        Double result = 0.0;
        int size = _inputPolynomial.size();
        for (Double val : _inputPolynomial) {
            if(--size == 0){
                result += val;
            }
            else{
                result += (val* Math.pow(x,size));
            }
        }
        return result;
    }
}
