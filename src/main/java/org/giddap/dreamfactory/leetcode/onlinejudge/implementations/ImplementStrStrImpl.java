package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ImplementStrStr;

public class ImplementStrStrImpl implements ImplementStrStr {

    @Override
    public String strStr(String haystack, String needle) {
        final int hLen = haystack.length();
        final int nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++) {
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
