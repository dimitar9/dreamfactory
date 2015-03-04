package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Candy;

/**
 * Time: O(n); Space: O(n); scan only once
 */
public class CandyScanOnceImpl implements Candy {
    @Override
    public int candy(int[] ratings) {
        final int n = ratings.length;
        if (n == 0) {
            return 0;
        }
        int[] c = new int[n];
        c[0] = 1;
        int highIdx = 0;
        int sum = c[0];
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                c[i] = c[i - 1] + 1;
                sum += c[i];
                highIdx = i;
            } else if (ratings[i] < ratings[i - 1]) {
                int m = i - highIdx;
                sum += m;
                c[i] = 1;
                if (m >= c[highIdx]) {
                    c[highIdx] += 1;
                    sum += 1;
                }
            } else {
                c[i] = 1;
                sum += 1;
                highIdx = i;
            }
        }
        return sum;
    }
}
