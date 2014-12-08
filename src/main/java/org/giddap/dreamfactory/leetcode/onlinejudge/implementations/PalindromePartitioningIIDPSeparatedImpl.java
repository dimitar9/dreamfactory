package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioningII;

/**
 * Created by peng on 12/7/14.
 */
public class PalindromePartitioningIIDPSeparatedImpl implements PalindromePartitioningII {
    private boolean[][] buildPalindromeTable(String s) {
        int len = s.length();
        // T[i][j] == true iff s[i..j] is a palindrome
        boolean[][] T = new boolean[len][len];
        for (int i = 0; i < len; ++i) {
            T[i][i] = true;
            // odd case
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                T[l--][r++] = true;
            }
            // even case
            l = i;
            r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                T[l--][r++] = true;
            }
        }
        return T;
    }

    public int minCut(String s) {
        int len = s.length();
        if (len <= 1) return 0;

        // build up a table of palindrome substrings
        // T[i][j] == true iff s[i..j] is a palindrome
        boolean[][] palindrome = buildPalindromeTable(s);

        // build up a table for minimum cuts of substrings
        // Cuts[i] = k means the minimum cuts needed for s[i..len-1] is k
        int[] Cuts = new int[len];
        Cuts[len - 1] = 0;
        for (int i = len - 2; i >= 0; --i) {
            if (palindrome[i][len - 1]) {
                Cuts[i] = 0;
            } else {
                Cuts[i] = len - i;
                for (int j = i; j < len - 1; ++j) {
                    if (palindrome[i][j]) {
                        Cuts[i] = Math.min(Cuts[i], 1 + Cuts[j + 1]);
                    }
                }
            }
        }
        return Cuts[0];
    }
}
