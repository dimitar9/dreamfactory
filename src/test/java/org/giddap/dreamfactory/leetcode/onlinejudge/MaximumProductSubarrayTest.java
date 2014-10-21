package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MaximumProductSubarray2dDPImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray solution = new MaximumProductSubarray2dDPImpl();

    @Test
    public void small01() {
        int[] input = {2, 3, -2, 4};
        assertEquals(6, solution.maxProduct(input));
    }
}
