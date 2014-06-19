package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q091DecodeWays;

public class Q091DecodeWaysBottomUpDPImpl implements Q091DecodeWays {
    @Override
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = s.length();
        if (len == 0) {
            return 0;
        }
        int prevCount = 1;
        int prevPrevCount = 1;
        for (int i = 0; i < len; i++) {
            int count = 0;
            char ch = s.charAt(i);
            if (ch != '0') {
                count = prevCount;
            }

            if (i > 0) {
                char prevChar = s.charAt(i - 1);
                int pair = (prevChar - '0') * 10 + (ch - '0');
                if (10 <= pair && pair <= 26) {
                    count += prevPrevCount;
                }

            }

            prevPrevCount = prevCount;
            prevCount = count;
        }

        return prevCount;
    }
}
