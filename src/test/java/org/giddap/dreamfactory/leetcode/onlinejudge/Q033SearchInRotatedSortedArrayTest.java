package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q033SearchInRotatedSortedArrayImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q033SearchInRotatedSortedArrayTest {
    private Q033SearchInRotatedSortedArray solution = new Q033SearchInRotatedSortedArrayImpl();

    @Test
    public void small01() {
        int[] input = new int[]{1};
        int target = 0;

        assertEquals(-1, solution.search(input, target));
    }


    @Test
    public void small02() {
        int[] input = new int[]{3, 5, 1};
        int target = 1;

        assertEquals(2, solution.search(input, target));
    }

    @Test
    public void small03() {
        int[] input = new int[]{1, 3};
        int target = 3;

        assertEquals(1, solution.search(input, target));
    }

    @Test
    public void small04() {
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        assertEquals(-1, solution.search(input, target));
    }

    @Test
    public void small05() {
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        assertEquals(2, solution.search(input, target));
    }

    @Test
    public void small06() {
        int[] input = new int[]{3, 1};
        int target = 3;

        assertEquals(0, solution.search(input, target));
    }
}
