package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q069SqrtX;

public class Q069SqrtXNewtonImpl implements Q069SqrtX {
    @Override
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x == 0) return 0;

        // initial guess
        double y = x - 0.0001;
        while (Math.abs(y * y - x) > 0.00001) {
            y = (y + x / y) / 2.;
        }
        return (int) y;
    }
}
