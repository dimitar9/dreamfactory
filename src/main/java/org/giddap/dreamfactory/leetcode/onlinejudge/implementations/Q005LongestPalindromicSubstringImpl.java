package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q005LongestPalindromicSubstring;

public class Q005LongestPalindromicSubstringImpl implements Q005LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s.length() == 0) {
            return "";
        }

        String lp = "";
        for (int i = 0; i < s.length(); i++) {
            String exp1 = expandPalindrome(s, i, i);
            lp = (exp1.length() > lp.length()) ? exp1 : lp;
            String exp2 = expandPalindrome(s, i, i + 1);
            lp = (exp2.length() > lp.length()) ? exp2 : lp;
        }

        return lp;
    }

    private String expandPalindrome(String word, int l, int r) {
        while (l >= 0 && r <= word.length() - 1
                && word.charAt(l) == word.charAt(r)) {
            l--;
            r++;
        }
        return word.substring(l + 1, r);
    }
}
