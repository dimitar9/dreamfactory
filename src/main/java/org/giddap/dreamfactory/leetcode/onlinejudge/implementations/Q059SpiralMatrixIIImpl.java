package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q059SpiralMatrixII;

public class Q059SpiralMatrixIIImpl implements Q059SpiralMatrixII {

    @Override
    public int[][] generateMatrix(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int[][] ret = new int[n][n];
        build(ret, 0, 1);
        return ret;
    }

    private void build(int[][] ret, int layer, int startNum) {
        final int len = ret.length - layer * 2 - 1;

        if (len == 0) {
            ret[layer][layer] = startNum;
            return;
        }

        // top
        for (int i = 0; i < len; i++) {
            ret[layer][layer + i] = startNum++;
        }

        // right
        for (int i = 0; i < len; i++) {
            ret[layer + i][layer + len] = startNum++;
        }

        // bottom
        for (int i = len; i > 0; i--) {
            ret[layer + len][layer + i] = startNum++;
        }

        // left
        for (int i = len; i > 0; i--) {
            ret[layer + i][layer] = startNum++;
        }

        if (len > 1) {
            build(ret, layer + 1, startNum);
        }
    }
}
