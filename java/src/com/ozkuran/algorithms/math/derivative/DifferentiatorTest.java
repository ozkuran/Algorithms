package com.ozkuran.algorithms.math.derivative;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahmutAli on 2/25/2015.
 * Test Class for Differentiator
 */
public class DifferentiatorTest extends TestCase {

    public void testShouldDifferentiate_x_in_5() throws Exception {
        ArrayList<Double> poly = new ArrayList<Double>();
        poly.add(5.0);
        poly.add(0.0);
        Differentiator diff = new Differentiator(poly);
        double result1 = diff.calculate(1.0);
        assertEquals(result1 ,5.0);
    }

}
