package com.ozkuran.algorithms.math.chebyshevdistance;

import junit.framework.TestCase;

public class ChebyshevDistanceTest extends TestCase {


    public void testShouldCalculateChebyshevDistance() throws Exception {
        ChebyshevDistance cd = new ChebyshevDistance();
        double result1 = cd.chebyshevDistance(0,0,0,1);
        assertEquals(result1 ,1.0);
    }
}