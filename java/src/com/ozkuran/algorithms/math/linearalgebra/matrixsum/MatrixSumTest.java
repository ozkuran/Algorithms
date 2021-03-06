package com.ozkuran.algorithms.math.linearalgebra.matrixsum;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class MatrixSumTest extends TestCase {

    public void testShouldCalculateIntegerMatrixSumWithEqualSizes() throws Exception {
        MatrixSum ms = new MatrixSum();
        Integer[][] result1 = new Integer[][]{{1, 1}, {1, 1}};
        Integer[][] input1 = new Integer[][]{{1, 1}, {0, 0}};
        Integer[][] input2 = new Integer[][]{{0, 0}, {1, 1}};
        Integer[][] output = ms.sum(input1, input2);
        assertArrayEquals(result1, output);
    }

    public void testShouldCalculateDoubleMatrixSumWithEqualSizes() throws Exception {
        MatrixSum ms = new MatrixSum();
        Double[][] result1 = new Double[][]{{1.0, 1.0}, {1.0, 1.0}};
        Double[][] input1 = new Double[][]{{1.0, 1.0}, {0.0, 0.00}};
        Double[][] input2 = new Double[][]{{0.0, 0.0}, {1.0, 1.0}};
        Double[][] output = ms.sum(input1, input2);
        assertArrayEquals(result1, output);
    }


}