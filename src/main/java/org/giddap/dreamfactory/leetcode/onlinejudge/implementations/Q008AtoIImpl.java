package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q008AtoI;


public class Q008AtoIImpl implements Q008AtoI {
    @Override
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = str.length();
        int i = 0;
        char[] chars = str.toCharArray();
        while (i < len && chars[i] == ' ') {
            i++;
        }

        boolean isNegative = false;
        if (i < len && chars[i] == '-') {
            isNegative = true;
            i++;
        } else if (i < len && chars[i] == '+') {
            i++;
        }

        long ret = 0;
        while (i < len && '0' <= chars[i] && chars[i] <= '9') {
            ret = 10 * ret + (chars[i] - '0');
            if (isNegative && 0 - ret <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (ret >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return isNegative ? 0 - (int) ret : (int) ret;
    }
}
