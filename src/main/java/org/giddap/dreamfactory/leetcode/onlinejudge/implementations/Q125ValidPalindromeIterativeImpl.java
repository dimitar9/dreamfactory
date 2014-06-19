package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q125ValidPalindrome;

public class Q125ValidPalindromeIterativeImpl implements Q125ValidPalindrome {
    @Override
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }

        return true;
    }

}
