package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q050Power;

public class Q050PowerImpl implements Q050Power {
    @Override
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int y = Math.abs(n);
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
