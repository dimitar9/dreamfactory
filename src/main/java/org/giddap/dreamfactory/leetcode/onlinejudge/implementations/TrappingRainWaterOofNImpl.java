package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.TrappingRainWater;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>One-Dimension DP.</li>
 * <li>Similar to the idea of calculating Max. Subarray,
 * we calculate left highs and right highs for each individual position
 * using an O(1) approach.</li>
 * <li>Time complexity: O(n)</li>
 * <li>Space complexity: O(n)</li>
 * <li>Note we use the following to represent possible movements:
 * <pre>
 * leftHighs[i] = Math.max(leftHighs[i - 1], A[i - 1]);
 * </pre>
 * </li>
 * </ul>
 */
public class TrappingRainWaterOofNImpl implements TrappingRainWater {
    @Override
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = A.length;
        if (len == 0) {
            return 0;
        }

        int[] leftHighs = new int[len];
        leftHighs[0] = A[0];
        for (int i = 1; i < len; i++) {
            leftHighs[i] = Math.max(leftHighs[i - 1], A[i - 1]);
        }

        int[] rightHighs = new int[len];
        rightHighs[len - 1] = A[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightHighs[i] = Math.max(rightHighs[i + 1], A[i + 1]);
        }

        int ret = 0;
        for (int i = 0; i < len; i++) {
            ret += Math.max(0, Math.min(leftHighs[i], rightHighs[i]) - A[i]);
        }
        return ret;
    }
}
