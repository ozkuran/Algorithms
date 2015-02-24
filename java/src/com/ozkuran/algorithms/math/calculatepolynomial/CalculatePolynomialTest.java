package com.ozkuran.algorithms.math.calculatepolynomial;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahmutAli on 2/24/2015.
 */
public class CalculatePolynomialTest extends TestCase {

    public void testShouldCalculatePolynomial_x_at_0() throws Exception {
        List<Double> poly = new ArrayList<Double>();
        poly.add(1.0);
        poly.add(0.0);
        CalculatePolynomial cp = new CalculatePolynomial();
        double result1 = cp.calculate(poly,0.0);
        assertEquals(result1 ,0.0);
    }

    public void testShouldCalculatePolynomial_x2_at_0() throws Exception {
        List<Double> poly = new ArrayList<Double>();
        poly.add(1.0);
        poly.add(0.0);
        poly.add(0.0);
        CalculatePolynomial cp = new CalculatePolynomial();
        double result1 = cp.calculate(poly,0.0);
        assertEquals(result1 ,0.0);
    }
}
