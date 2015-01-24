package com.ozkuran.algorithms.math.squareddistance;

import junit.framework.TestCase;

public class SquaredDistanceTest extends TestCase {

    public void testShouldCalculateSquaredDistance() throws Exception {
        SquaredDistance sd = new SquaredDistance();
        double result1 = sd.squaredDistance(0,0,0,1);
        assertEquals(result1 ,1.0);
    }
}