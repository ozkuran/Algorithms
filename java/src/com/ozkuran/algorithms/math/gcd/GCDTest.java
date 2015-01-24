package com.ozkuran.algorithms.math.gcd;

import junit.framework.TestCase;

public class GCDTest extends TestCase {

    public void testShouldCalculateGreatCommonDivisor() throws Exception {
        GCD gcd = new GCD();
        int result1 = gcd.gcd(6, 3);
        assertEquals(result1 ,3);
    }

    public void testShouldReturnZeroWhenDivisorIsZero() throws Exception {
        GCD gcd = new GCD();
        int result1 = gcd.gcd(6, 0);
        assertEquals(result1 ,0);
    }

}