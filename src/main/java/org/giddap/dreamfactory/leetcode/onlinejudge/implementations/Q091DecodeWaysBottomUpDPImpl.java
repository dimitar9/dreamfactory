package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q091DecodeWays;

public class Q091DecodeWaysBottomUpDPImpl implements Q091DecodeWays {
    @Override
    public int numDecodings(String s) {
        char[] cs = s.toCharArray();
        final int len = cs.length;
        if (len == 0) {
            return 0;
        }

        int[] dw = new int[len + 1];
        dw[0] = 1;
        dw[1] = cs[0] == '0' ? 0 : 1;
        int prev = cs[0] - '0';
        for (int i = 1; i < len && dw[i - 1] != 0; ++i) {
            int curr = cs[i] - '0';
            if (curr == 0) {
                if (prev == 1 || prev == 2) {
                    dw[i + 1] = dw[i - 1];
                }
            } else {
                dw[i + 1] = dw[i];
                if (prev != 0 && prev * 10 + curr <= 26) {
                    dw[i + 1] += dw[i - 1];
                }
            }
            prev = curr;
        }
        return dw[len];
    }
}
