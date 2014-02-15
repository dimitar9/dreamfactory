package org.giddap.dreamfactory.mitbbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FindMinimumAbsoluteDifferenceBetweenTwoNumbersFromTwoSortedArraysTest {
    private FindMinimumAbsoluteDifferenceBetweenTwoNumbersFromTwoSortedArrays solution =
            new FindMinimumAbsoluteDifferenceBetweenTwoNumbersFromTwoSortedArrays();

    @Test
    public void small01() {
        int[] a = {0, 3};
        int[] b = {2, 7, 9};

        assertEquals(1, solution.find(a, b));
    }

    @Test
    public void small02() {
        int[] a = {0, 2, 3};
        int[] b = {1, 2, 7, 9};

        assertEquals(0, solution.find(a, b));
    }
}
