package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Power;

public class PowerRecursiveImpl implements Power {
    public double pow(double x, int n) {
        return (n >= 0) ? doPow(x, (long) n) : 1 / doPow(x, Math.abs((long) n));
    }

    public double doPow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        double tmp = doPow(x * x, n / 2);
        return ((n & 1) == 1) ? x * tmp : tmp;
    }
}
