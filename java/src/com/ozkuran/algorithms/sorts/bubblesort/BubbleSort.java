package com.ozkuran.algorithms.sorts.bubblesort;

/**
 * @version 0.0.6.23
 * Created by MahmutAli on 11/9/2009.
 * Last Update by MahmutAli on 1/24/2015.
 * Returns if given Array in sorted order with Bubble Sort
 * Worst Case Performance O(n.n)
 * Best Case Performance O(n)
 * Average Case Performance O(n.n)
 */
public abstract class BubbleSort<T extends Comparable<T>> {

    public static <T extends Comparable<? super T>> T[] sort(T[] input) {
        boolean swapped = true;
        int length = input.length;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < length; i++) {
                if (input[i].compareTo(input[i - 1]) < 0) {
                    swap(i, i - 1, input);
                    swapped = true;
                }
            }
            length--;
        }
        return input;
    }

    private static <T extends Comparable<? super T>> void swap(int index1, int index2, T[] input) {
        T value = input[index1];
        input[index1] = input[index2];
        input[index2] = value;
    }
}