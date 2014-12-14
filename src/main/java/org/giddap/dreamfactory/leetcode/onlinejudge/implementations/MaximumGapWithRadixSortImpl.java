package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumGap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MaximumGapWithRadixSortImpl implements MaximumGap {
    @Override
    public int maximumGap(int[] num) {
        final int len = num.length;
        if (len < 2) {
            return 0;
        }
        for (int i = 0; i < 32; i++) {
            List<Integer> zeros = new ArrayList<>();
            List<Integer> ones = new ArrayList<>();
            for (int n : num) {
                if (((n >> i) & 1) == 1) {
                    ones.add(n);
                } else {
                    zeros.add(n);
                }
            }
            int h = 0;
            for (int zero : zeros) {
                num[h] = zero;
                h++;
            }
            for (int one : ones) {
                num[h] = one;
                h++;
            }
        }

        int maxGap = 0;
        for (int i = 1; i < len; i++) {
            maxGap = Math.max(num[i] - num[i - 1], maxGap);
        }

        return maxGap;
    }
}
