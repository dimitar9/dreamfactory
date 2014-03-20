package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DivideTwoIntegers;

import java.util.ArrayList;
import java.util.List;

public class DivideTwoIntegersImpl implements DivideTwoIntegers {

    @Override
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        List<Long> divisors = new ArrayList<Long>();
        divisors.add(b);
        long c = b;
        while (c <= a) {
            c <<= 1;
            divisors.add(c);
        }

        long ret = 0;
        int i = divisors.size() - 1;
        while (i >= 0) {
            if (a >= divisors.get(i)) {
                a -= divisors.get(i);
                ret += 1 << i;
            } else {
                i--;
            }
        }

        return (((dividend ^ divisor) >>> 31) == 1) ? (int) (0 - ret) : (int) (ret);
    }
}
