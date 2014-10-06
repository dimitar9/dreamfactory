package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestPalindromicSubstring;

public class LongestPalindromicSubstringImpl implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s must not be null.");
        }
        final int len = s.length();
        if (len <= 1) {
            return s;
        }

        String lps = s.substring(0, 1);
        for (int i = 0; i < len; i++) {
            String expandBothSides = expandPalidrom(s, i, i);
            String expandToRight = expandPalidrom(s, i, i + 1);
            String lpsi = expandBothSides;
            if (expandBothSides.length() < expandToRight.length()) {
                lpsi = expandToRight;
            }
            if (lps.length() < lpsi.length()) {
                lps = lpsi;
            }
        }

        return lps;
    }

    private String expandPalidrom(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i + 1, j);
    }
}
