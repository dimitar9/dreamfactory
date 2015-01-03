package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ImplementStrStr;

public class ImplementStrStrImpl implements ImplementStrStr {

    @Override
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
}
