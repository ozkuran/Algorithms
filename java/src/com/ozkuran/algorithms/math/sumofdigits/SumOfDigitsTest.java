package com.ozkuran.algorithms.math.sumofdigits;


import junit.framework.TestCase;

/**
 * Created by MahmutAli on 2/24/2015.
 * Test case for DoubledTotalDigits method
 */
public class SumOfDigitsTest extends TestCase{

    public void testShouldCalculateDoubleTotalDigitsOf5() throws Exception {
        SumOfDigits dtd = new SumOfDigits(5);
        int result1 = dtd.calculate();
        assertEquals(result1 ,1);
    }
}
