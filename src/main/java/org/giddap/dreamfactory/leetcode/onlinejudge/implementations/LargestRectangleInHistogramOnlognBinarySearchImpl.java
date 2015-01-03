package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LargestRectangleInHistogram;

import java.util.Arrays;

/**
 * Divide and Conquer
 */
public class LargestRectangleInHistogramOnlognBinarySearchImpl implements LargestRectangleInHistogram {
    @Override
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = height.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return height[0];
        }

        int nMinIndex = 0;
        for (int i = 1; i < len; i++) {
            if (height[nMinIndex] > height[i]) {
                nMinIndex = i;
            }
        }

        int nCur = height[nMinIndex] * len;
        int nLft = largestRectangleArea(Arrays.copyOfRange(height, 0, nMinIndex));
        int nRgt = largestRectangleArea(Arrays.copyOfRange(height, nMinIndex + 1, len));

        return Math.max(nCur, Math.max(nLft, nRgt));
    }
}
