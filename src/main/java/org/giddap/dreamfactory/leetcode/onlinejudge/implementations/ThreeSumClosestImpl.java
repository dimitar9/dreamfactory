package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosestImpl implements ThreeSumClosest {
    @Override
    public int threeSumClosest(int[] num, int target) {
        final int len = num.length;

        Arrays.sort(num);
        int md = Integer.MAX_VALUE;
        int csum = 0;
        for (int i = 0; i < len - 2; ++i) {
            if (i > 0 && num[i - 1] == num[i]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    j++;
                    continue;
                }
                if (k < len - 1 && num[k] == num[k + 1]) {
                    k--;
                    continue;
                }
                final int tmpSum = num[i] + num[j] + num[k];
                final int tmpDelta = tmpSum - target;
                if (Math.abs(tmpDelta) < md) {
                    csum = num[i] + num[j] + num[k];
                    md = Math.abs(tmpDelta);
                }

                if (tmpDelta == 0) {
                    return target;
                } else if (tmpDelta > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return csum;
    }
}
