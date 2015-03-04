package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/**
 * Algorithm:
 * 1. Use DP to build a table of 'palindrome' partitions.
 * 2. Use DFS to construct the list of substrings.
 */
public class PalindromePartitioningDfsDpImpl implements PalindromePartitioning {
    /**
     * build up a table
     * T[i][j] == true if s[i..j] is a palindrome
     */
    private boolean[][] palindromeTable(String s) {
        boolean[][] T = new boolean[s.length()][s.length()];
        // single-char word is a palindrome
        for (int i = 0; i < s.length(); ++i) T[i][i] = true;
        // multi-char words
        for (int i = 1; i < s.length(); ++i) {
            // even
            int l = i - 1;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                T[l--][r++] = true;
            }
            // odd
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                T[l--][r++] = true;
            }
        }
        return T;
    }

    /**
     * return all partitions of substring s[l..(s.len-1)]
     */
    private void partitionHelper(
            String s, int l, boolean[][] T, List<List<String>> results) {
        if (l == s.length()) {
            results.add(new ArrayList<String>());
        }
        for (int i = l; i < s.length(); ++i) {
            if (T[l][i]) {
                List<List<String>> res = new ArrayList<>();
                partitionHelper(s, i + 1, T, res);
                for (List<String> partition : res) {
                    partition.add(0, s.substring(l, i + 1));
                }
                results.addAll(res);
            }
        }
    }

    /**
     * return all partitions of string s
     */
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<>();
        partitionHelper(s, 0, palindromeTable(s), results);
        return results;
    }
}
