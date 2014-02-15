package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q016ThreeSumClosest;

import java.util.Arrays;

public class Q016ThreeSumClosestImpl implements Q016ThreeSumClosest {
    @Override
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = num.length;
        if (len == 0) {
            return 0;
        }

        Arrays.sort(num);

        int minDelta = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                int delta = sum - target;
                if (delta == 0) {
                    return target;
                } else if (delta > 0) {
                    k--;
                } else {
                    j++;
                }
                if (Math.abs(delta) < minDelta) {
                    minDelta = Math.abs(delta);
                    closestSum = sum;
                }
            }
        }

        return closestSum;
    }
}
