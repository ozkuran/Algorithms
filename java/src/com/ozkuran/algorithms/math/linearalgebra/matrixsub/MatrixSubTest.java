package com.ozkuran.algorithms.math.linearalgebra.matrixsub;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class MatrixSubTest extends TestCase {

    public void testShouldCalculateIntegerMatrixSubWithEqualSizes() throws Exception {
        MatrixSub ms = new MatrixSub();
        Integer[][] result1 = new Integer[][]{{1, 1}, {-1, -1}};
        Integer[][] input1 = new Integer[][]{{1, 1}, {0, 0}};
        Integer[][] input2 = new Integer[][]{{0, 0}, {1, 1}};
        Integer[][] output = ms.sub(input1, input2);
        assertArrayEquals(result1, output);
    }

    public void testShouldCalculateDoubleMatrixSumWithEqualSizes() throws Exception {
        MatrixSub ms = new MatrixSub();
        Double[][] result1 = new Double[][]{{1.0, 1.0}, {-1.0, -1.0}};
        Double[][] input1 = new Double[][]{{1.0, 1.0}, {0.0, 0.00}};
        Double[][] input2 = new Double[][]{{0.0, 0.0}, {1.0, 1.0}};
        Double[][] output = ms.sub(input1, input2);
        assertArrayEquals(result1, output);
    }


}