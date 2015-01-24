package com.ozkuran.algorithms.math.lcm;

import junit.framework.TestCase;

public class LCMTest extends TestCase {

    public void testShouldCalculateLeastCommonMultiplier() throws Exception {
        LCM lcm = new LCM();
        int result1 = lcm.lcm(6, 3);
        assertEquals(result1 ,6);
    }
}