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
        final int n = A.length;
        // find highs on the left and on the right
        int[] leftHighs = new int[n];
        int[] rightHighs = new int[n];
        for (int i = 1; i < n; i++) {
            leftHighs[i] = Math.max(leftHighs[i - 1], A[i - 1]);
            rightHighs[n - 1 - i] = Math.max(rightHighs[n - i], A[n - i]);
        }
        // count trapped water one index by one index
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret += Math.max(0, Math.min(leftHighs[i], rightHighs[i]) - A[i]);
        }
        return ret;
    }
}
