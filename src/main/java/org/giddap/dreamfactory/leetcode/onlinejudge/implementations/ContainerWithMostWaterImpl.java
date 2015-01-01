package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ContainerWithMostWater;

public class ContainerWithMostWaterImpl implements ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ma = 0;
        while (l < r) {
            ma = Math.max(ma, Math.min(height[l], height[r]) * (r - l));
            if (height[l] == height[r]) {
                l++;
                r--;
            } else if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ma;
    }
}
    