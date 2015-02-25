package com.ozkuran.algorithms.security.checksum.tendigitisbncheck;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * @version 0.1.2
 * Created by MahmutAli on 1/4/2001.
 * Last Updated by MahmutAli on 2/26/2015.
 * Implementation of IBM Check Method
 */
public class TenDigitISBNCheckTest extends TestCase {
    public void testShouldReturnTrueFor_18() throws Exception {
        ArrayList<Integer> poly = new ArrayList<Integer>();
        poly.add(1);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        TenDigitISBNCheck isbnc = new TenDigitISBNCheck(poly);
        boolean result1 = isbnc.check();
        assertEquals(result1 ,true);
    }
}
