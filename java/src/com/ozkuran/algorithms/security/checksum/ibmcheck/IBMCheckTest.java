package com.ozkuran.algorithms.security.checksum.ibmcheck;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahmutAli on 2/26/2015.
 */
public class IBMCheckTest extends TestCase {

    public void testShouldReturnTrueFor_18() throws Exception {
        ArrayList<Integer> poly = new ArrayList<Integer>();
        poly.add(1);
        poly.add(8);
        IBMCheck ibmc = new IBMCheck(poly);
        boolean result1 = ibmc.check();
        assertEquals(result1 ,true);
    }
}
