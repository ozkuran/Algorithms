package com.ozkuran.algorithms.math.approximation.montecarlo.pi;

/**
 * @version 0.0.3.13
 * Last Update by MahmutAli on 2/25/2015.
 * Created by MahmutAli on 1/9/2004.
 * Calculates value of Pi using Monte Carlo Method
 */
public class Pi {

    private Integer _trials;
    private Integer _currentTrial;
    private Integer inside, outside;

    public Pi(Integer trials){
        _trials = trials;
        _currentTrial = 0;
        inside = 0;
        outside = 0;
    }

    public double calculate(){
        while (_currentTrial <= _trials){
            double x = Math.random()*1;
            double y = Math.random()*1;
            double sumOfSquares = (x*x) + (y*y);
            double distance = Math.sqrt(sumOfSquares);
            if(distance <= 1.0) {
                inside++;
            }
            else{
                outside++;
            }
            _currentTrial++;
        }
        return (4 * (double)(inside) / ((double)inside + (double)outside));
    }
}
