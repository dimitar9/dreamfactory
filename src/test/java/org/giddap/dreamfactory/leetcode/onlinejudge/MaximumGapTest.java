package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MaximumGapWithRadixSortImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class MaximumGapTest {
    private MaximumGap solution = new MaximumGapWithRadixSortImpl();

    @Test
    public void small01() {
        int[] input = new int[]{3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(input));
    }
}
