package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SingleNumberII;

/**
 *
 */
public class SingleNumberIIWithArrayImpl implements SingleNumberII {
    @Override
    public int singleNumber(int[] A) {
        int[] memo = new int[32];
        for (int a : A) {
            int i = 0;
            while (i <= 31) {
                memo[i] += a & 1;
                a = a >> 1;
                i++;
            }
        }
        int ret = 0;
        for (int i = 31; i >= 0; i--) {
            ret = (ret << 1) | (memo[i] % 3);
        }
        return ret;
    }
}
