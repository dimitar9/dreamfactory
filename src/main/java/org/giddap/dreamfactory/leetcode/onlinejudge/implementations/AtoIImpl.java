package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.AtoI;


public class AtoIImpl implements AtoI {
    @Override
    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        final int len = str.length();
        final char[] s = str.toCharArray();
        long n = 0L;
        int i = 0;
        while (i < len && s[i] == ' ') {
            i++;
        }

        if (i == len) {
            return 0;
        }
        boolean hasDigit = false;
        boolean isNeg = false;
        if (s[i] == '-') {
            isNeg = true;
            i++;
        } else if (s[i] == '+') {
            i++;
        }

        while (i < len && s[i] >= '0' && s[i] <= '9') {
            if (!hasDigit) {
                hasDigit = true;
            }
            n = n * 10 + (s[i] - '0');
            i++;
        }

        if (hasDigit) {
            if (isNeg) {
                n = 0 - n;
                if (n < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else if (n > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) n;
        }
        return 0;
    }
}
