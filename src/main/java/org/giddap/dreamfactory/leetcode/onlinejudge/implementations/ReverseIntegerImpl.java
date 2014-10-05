package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseInteger;

public class ReverseIntegerImpl implements ReverseInteger {
    @Override
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean isNeg = false;
        long xx = x;
        if (xx < 0) {
            isNeg = true;
            xx = 0 - xx;
        }

        long ret = 0L;
        while (xx > 0) {
            ret = ret * 10 + xx % 10;
            xx /= 10;
        }

        ret = isNeg ? 0 - ret : ret;

        if (ret > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (ret < Integer.MIN_VALUE) {
            ret = Integer.MIN_VALUE;
        }
        return (int) ret;
    }
}
