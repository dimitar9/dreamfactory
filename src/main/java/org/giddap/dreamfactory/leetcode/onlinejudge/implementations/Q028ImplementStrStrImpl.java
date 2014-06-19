package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q028ImplementStrStr;

public class Q028ImplementStrStrImpl implements Q028ImplementStrStr {

    @Override
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int hLen = haystack.length();
        final int nLen = needle.length();
        if (nLen == 0) {
            return haystack;
        }

        for (int i = 0; i <= (hLen - nLen); i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return haystack.substring(i);
            }
        }
        return null;
    }
}
