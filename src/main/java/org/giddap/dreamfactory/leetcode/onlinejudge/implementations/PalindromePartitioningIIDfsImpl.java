package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioningII;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peng on 12/7/14.
 */
public class PalindromePartitioningIIDfsImpl implements PalindromePartitioningII {


    public int minCut(String s) {
        final int len = s.length();
        if (len <= 1) {
            return 0;
        }

        Map<String, Integer> memo = new HashMap<>();
        memo.put("", 0);

        return minCut(s, memo);
    }

    public int minCut(String s, Map<String, Integer> memo) {

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        if (isPalindrome(s)) {
            memo.put(s, 0);
            return 0;
        }

        int minCut = s.length() - 1;
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            if (memo.containsKey(prefix) || isPalindrome(prefix)) {
                memo.put(prefix, 0);
                int suffixCount;
                if (memo.containsKey(suffix)) {
                    suffixCount = memo.get(suffix);
                } else {
                    suffixCount = minCut(s.substring(i));
                    memo.put(suffix, suffixCount);
                }
                minCut = Math.min(minCut,  suffixCount + 1);
            }
        }
        return minCut;
    }

    private boolean isPalindrome(String s) {
        final int len = s.length();
        if (len <= 1) {
            return true;
        }
        int l = 0;
        int r = len - 1;
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
