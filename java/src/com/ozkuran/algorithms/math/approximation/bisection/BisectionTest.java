package com.ozkuran.algorithms.math.approximation.bisection;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahmutAli on 2/24/2015.
 */
public class BisectionTest extends TestCase {

    public void testShouldCalculatePolynomial_x_Root() throws Exception {
        List<Double> poly = new ArrayList<Double>();
        poly.add(1.0);
        poly.add(0.0);
        Bisection bis = new Bisection(poly,100,0.0001);
        double result1 = bis.calculate();
        assertEquals(result1 ,0.0);
    }

    public void testShouldCalculatePolynomial_x2_Root() throws Exception {
        List<Double> poly = new ArrayList<Double>();
        poly.add(1.0);
        poly.add(0.0);
        Bisection bis = new Bisection(poly,100,0.0001);
        double result1 = bis.calculate();
        assertEquals(result1 ,0.0);
    }
}
