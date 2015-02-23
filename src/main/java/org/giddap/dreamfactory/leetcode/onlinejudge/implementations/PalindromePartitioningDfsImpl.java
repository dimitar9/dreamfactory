package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/**
 * if S[0..i] is palindrome, try S[i..n].
 */
public class PalindromePartitioningDfsImpl implements PalindromePartitioning {
    @Override
    public List<List<String>> partition(String s) {
        List<List<String>> r = new ArrayList<>();
        helper(r, new ArrayList<>(), s);
        return r;
    }

    private void helper(List<List<String>> r, List<String> c, String s) {
        final int n = s.length();
        if (n == 0) {
            List<String> one = new ArrayList<>(c);
            r.add(one);
        } else {
            for (int i = 1; i <= n; i++) {
                String p = s.substring(0, i);
                if (isPalindrome(p)) {
                    c.add(p);
                    helper(r, c, s.substring(i, n));
                    c.remove(c.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
