package com.ozkuran.algorithms.math.isprime;

import junit.framework.TestCase;

public class IsPrimeTest extends TestCase {

    public void testShouldCheckIfOneIsPrime() throws Exception {
        IsPrime ip = new IsPrime();
        boolean result1 = ip.isPrime(1);
        assertFalse(result1);
    }

    public void testShouldCheckIfSevenIsPrime() throws Exception {
        IsPrime ip = new IsPrime();
        boolean result1 = ip.isPrime(7);
        assertTrue(result1);
    }

    public void testShouldCheckIf7919IsPrime() throws Exception {
        IsPrime ip = new IsPrime();
        boolean result1 = ip.isPrime(7919);
        assertTrue(result1);
    }
}