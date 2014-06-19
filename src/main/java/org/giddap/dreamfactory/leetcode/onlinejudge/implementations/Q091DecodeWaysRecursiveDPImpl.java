package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q091DecodeWays;

public class Q091DecodeWaysRecursiveDPImpl implements Q091DecodeWays {
    @Override
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.length() == 0) {
            return 0;
        }

        return countWays(s);
    }

    public int countWays(String suffix) {
        if (suffix.length() == 0) {
            return 1;
        }

        final int first = Character.digit(suffix.charAt(0), 10);
        if (first == 0) {
            return 0;
        }

        int sum = 0;
        sum += countWays(suffix.substring(1));

        final int len = suffix.length();
        if (len > 1) {
            final int second = Character.digit(suffix.charAt(1), 10);
            final int firstTwo = first * 10 + second;
            if (10 <= firstTwo && firstTwo <= 26) {
                sum += countWays(suffix.substring(2));
            }
        }

        return sum;
    }
}
