package org.giddap.dreamfactory.leetcode.onlinejudge;


import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MinimumPathSumDpImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class MinimumPathSumTest {
    private MinimumPathSum solution = new MinimumPathSumDpImpl();
    //private Q064MinimumPathSumDfsBacktrackingImpl solution = new Q064MinimumPathSumDfsBacktrackingImpl();

    @Test
    public void small01() {
        //[[1,2],[1,1]]
        int[] row1 = new int[]{1, 2};
        int[] row2 = new int[]{1, 1};
        int[][] input = new int[2][2];
        input[0] = row1;
        input[1] = row2;

        assertEquals(3, solution.minPathSum(input));
    }

    @Test
    public void small02() {
        //[[1,3,1],[1,5,1],[4,2,1]]
        int[] row1 = new int[]{1, 3, 1};
        int[] row2 = new int[]{1, 5, 1};
        int[] row3 = new int[]{4, 2, 1};
        int[][] input = new int[3][3];
        input[0] = row1;
        input[1] = row2;
        input[2] = row3;

        assertEquals(7, solution.minPathSum(input));
    }
}
