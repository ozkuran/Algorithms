package com.ozkuran.algorithms.math.derivative;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 0.1.12
 * Created by MahmutAli on 4/3/2004.
 * Last Update by MahmutAli on 1/24/2015.
 * Calculates Differentiate of the Given function
 */
public class Differentiator {
    List<Double> _polynomial;

    public Differentiator(List<Double> polynomial){
        _polynomial = polynomial;
    }

    public List<Double> calculate(){
        ArrayList<Double> result = new ArrayList<Double>();
        int size = _polynomial.size();
        int j = size;
        for (int i = 0; i < size; i++ ){
            result.add(j*_polynomial.get(i));
            j--;
        }
        return result;
    }

    public Double calculate(Double x){
        Double result = 0.0;
        int size = _polynomial.size();
        int j = size-1;
        for (int i = 0; i < size; i++ ){
            result += j * _polynomial.get(i) * Math.pow(x, j - 1);
            j--;
        }
        return result;
    }

}
