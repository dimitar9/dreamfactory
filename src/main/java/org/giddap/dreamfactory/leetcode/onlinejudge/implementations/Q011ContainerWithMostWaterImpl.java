package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q011ContainerWithMostWater;

public class Q011ContainerWithMostWaterImpl implements Q011ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int currArea = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(currArea, maxArea);
            if (height[l] > height[r]) {
                r--;
            } else if (height[l] < height[r]) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return maxArea;
    }
}
