package com.ozkuran.algorithms.security.checksum.usbankspncheck;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by MahmutAli on 2/26/2015.
 */
public class USBanksPNCheckTest extends TestCase {

    public void testShouldReturnTrueFor_110000000() throws Exception {
        ArrayList<Integer> poly = new ArrayList<Integer>();
        poly.add(1);
        poly.add(1);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        poly.add(0);
        USBanksPNCheck usbpnc = new USBanksPNCheck(poly);
        boolean result1 = usbpnc.check();
        assertEquals(result1 ,true);
    }

}
