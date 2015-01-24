package com.ozkuran.algorithms.math.euclideandistance;

import junit.framework.TestCase;

public class EuclideanDistanceTest extends TestCase {

    public void testShouldCalculateEuclideanDistance() throws Exception {
        EuclideanDistance ed = new EuclideanDistance();
        double result1 = ed.euclideanDistance(0,0,0,1);
        assertEquals(result1 ,1.0);
    }
}