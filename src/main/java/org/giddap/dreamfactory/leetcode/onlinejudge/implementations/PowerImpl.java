package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Power;

public class PowerImpl implements Power {
    @Override
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long y = Math.abs((long) n);
        double ret = 1L;

        while (y > 0) {
            if ((y & 1) == 1) {
                ret *= x;
            }
            y >>= 1;
            x *= x;
        }

        return n > 0 ? ret : 1.0 / ret;
    }
}
