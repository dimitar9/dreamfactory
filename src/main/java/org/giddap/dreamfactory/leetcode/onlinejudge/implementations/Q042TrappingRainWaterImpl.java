package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q042TrappingRainWater;

public class Q042TrappingRainWaterImpl implements Q042TrappingRainWater {
    @Override
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = A.length;

        if (len == 0) {
            return 0;
        }

        int[] rightHighs = new int[len];
        for (int i = 1; i < len; i++) {
            rightHighs[i] = Math.max(rightHighs[i - 1], A[i - 1]);
        }

        int[] leftHighs = new int[len];
        for (int i = len - 2; i >= 0; i--) {
            leftHighs[i] = Math.max(leftHighs[i + 1], A[i + 1]);
        }

        int ret = 0;
        for (int i = 0; i < len; i++) {
            ret += Math.max(0, Math.min(leftHighs[i], rightHighs[i]) - A[i]);
        }
        return ret;
    }
}
