package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Power;

public class PowerRecursiveImpl implements Power {
    public double pow(double x, int n) {
        if (n == 0) return 1;
        int exp = Math.abs(n);
        double half = pow(x, exp>>1);
        double res = half * half;
        if ((exp & 1) == 1) res *= x;
        return (n > 0) ? res : 1.0/res;
    }
}
