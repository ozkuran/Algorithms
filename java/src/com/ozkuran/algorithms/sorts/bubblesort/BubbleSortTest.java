package com.ozkuran.algorithms.sorts.bubblesort;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest extends TestCase {

    public void testSortsSmallIntegerArray() throws Exception {
        Integer[] input = {4,2,5,1};
        Integer[] sorted = {1,2,4,5};
        Integer[] output = null;

        output = BubbleSort.sort(input);
        assertArrayEquals(sorted, output);
    }


    public void testSortsSmallDoubleArray() throws Exception {
        Double[] input = {4.0,2.0,5.5,1.0};
        Double[] sorted = {1.0,2.0,4.0,5.5};
        Double[] output = null;

        output = BubbleSort.sort(input);
        assertArrayEquals(sorted, output);
    }
}