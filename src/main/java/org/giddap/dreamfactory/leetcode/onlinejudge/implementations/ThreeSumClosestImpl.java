package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosestImpl implements ThreeSumClosest {
    @Override
    public int threeSumClosest(int[] num, int target) {
        long closest = (long) Integer.MAX_VALUE;
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int m = i + 1;
            int n = num.length - 1;
            while (m < n) {
                int sum = num[i] + num[m] + num[n];
                if (sum == target) {
                    return target;
                } else {
                    if (Math.abs(sum - target) < Math.abs(closest - target)) {
                        closest = sum;
                    }
                    if (sum > target) {
                        n--;
                    } else {
                        m++;
                    }
                }
            }
        }
        return (int) closest;
    }
}
