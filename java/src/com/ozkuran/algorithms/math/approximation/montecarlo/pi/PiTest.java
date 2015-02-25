package com.ozkuran.algorithms.math.approximation.montecarlo.pi;
import junit.framework.TestCase;

/**
 * Created by MahmutAli on 2/24/2015.
 * Test case for Pi approximation
 */
public class PiTest extends TestCase {

    public void testShouldCalculatePiWith0_01_Error_with_1000_Trials() throws Exception {
        Pi pi = new Pi(10000);
        double result1 = pi.calculate();
        assertTrue(result1 > 3.13 && result1 < 3.15);
    }

}
