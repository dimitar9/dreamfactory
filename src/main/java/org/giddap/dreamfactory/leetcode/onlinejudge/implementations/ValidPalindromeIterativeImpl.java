package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ValidPalindrome;

/**
 * Time: O(n); Space: O(1)
 * Scan from both ends and compare the characters.
 */
public class ValidPalindromeIterativeImpl implements ValidPalindrome {
    @Override
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l))
                    != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
