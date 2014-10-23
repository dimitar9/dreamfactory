package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MaximumProductSubarray2dDPImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MaximumProductSubarrayOneIterationImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray solution =
            new MaximumProductSubarray2dDPImpl();
    private MaximumProductSubarray solutionOneIteration =
            new MaximumProductSubarrayOneIterationImpl();

    @Test
    public void small01() {
        int[] input = {2, 3, -2, 4};
        assertEquals(6, solution.maxProduct(input));
        assertEquals(6, solutionOneIteration.maxProduct(input));
    }

    @Test
    public void small02() {
        int[] input = {-2, 2, -1, 2, 3, -1, 4, -3};
        assertEquals(288, solution.maxProduct(input));
        assertEquals(288, solutionOneIteration.maxProduct(input));
    }

    @Test
    public void small03() {
        int[] input = {-2};
        assertEquals(-2, solution.maxProduct(input));
        assertEquals(-2, solutionOneIteration.maxProduct(input));
    }

    @Test
    public void small04() {
        int[] input = {-1, -1};
        assertEquals(solution.maxProduct(input), solutionOneIteration.maxProduct(input));
    }
}
