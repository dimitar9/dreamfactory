package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestPalindromicSubstring;

public class LongestPalindromicSubstringImpl implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        String lps = "";
        for (int i = 0; i < s.length(); i++) {
            String one = constructPalindrome(s, i, i);
            String two = constructPalindrome(s, i, i + 1);
            if (one.length() >= two.length()) {
                if (one.length() > lps.length()) {
                    lps = one;
                }
            } else {
                if (two.length() > lps.length()) {
                    lps = two;
                }
            }
        }
        return lps;
    }

    private String constructPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) != s.charAt(r)) {
                break;
            }
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
