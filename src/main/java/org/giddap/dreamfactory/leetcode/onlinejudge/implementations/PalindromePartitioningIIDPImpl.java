package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioningII;

public class PalindromePartitioningIIDPImpl implements PalindromePartitioningII {

    @Override
    public int minCut(String s) {
        final int len = s.length();

        // a table of palindrome substrings
        // T[i][j] == true iff s[i..j] is a palindrome
        boolean[][] palindrome = new boolean[len][len];

        // a table for minimum cuts of substrings
        // Cuts[i] = k means the minimum cuts needed for s[i..len-1] is k
        int[] Cuts = new int[len+1];

        Cuts[len] = -1;
        for (int i=len-1; i>=0; --i) {
            Cuts[i] = len - i;
            for (int j=i; j<len; ++j) {
                if (s.charAt(i)==s.charAt(j) && (j-i < 2 || palindrome[i+1][j-1])) {
                    palindrome[i][j] = true;
                    Cuts[i] = Math.min(Cuts[i], 1+Cuts[j+1]);
                }
            }
        }

        return Cuts[0];
    }
}
