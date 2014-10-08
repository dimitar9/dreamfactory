package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ContainerWithMostWater;

public class ContainerWithMostWaterImpl implements ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
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
    