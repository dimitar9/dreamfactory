package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

public class Q050PowerRecursiveImpl {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double ret = powRecursively(x, Math.abs(n));
        return n < 0 ? 1.0 / ret : ret;
    }

    public double powRecursively(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 0) {
            return 1.0;
        }

        double ret = 1.0;
        if (n % 2 == 1) {
            ret *= x;
        }

        return ret *= powRecursively(x * x, n / 2);
    }
}
