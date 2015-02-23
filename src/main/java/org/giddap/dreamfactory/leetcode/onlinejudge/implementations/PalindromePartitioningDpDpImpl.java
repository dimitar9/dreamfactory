package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromePartitioning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use 2 DP procedures to construct the palindromes.
 */
public class PalindromePartitioningDpDpImpl implements PalindromePartitioning {
    /* return all partitions of string s */
    public List<List<String>> partition(String s) {
        final int n = s.length();
        // build up a table for palindrome substrings
        boolean[][] T = palindromeTable(s);

        // this map is used to store previous results
        // preRes.get(i) is all partitions of s[i..len-1]
        Map<Integer, List<List<String>>> preRes = new HashMap<>();

        for (int i=s.length()-1; i>=0; --i) {
            List<List<String>> partitions = new ArrayList<>();
            for (int j=i; j<s.length(); ++j) {
                if (T[i][j]) {
                    if (j+1 == n) {
                        List<String> pp = new ArrayList<>();
                        pp.add(s.substring(i, j+1));
                        partitions.add(pp);
                    } else {
                        for (List<String> p : preRes.get(j+1)) {
                            List<String> pp = new ArrayList<>();
                            pp.add(s.substring(i, j+1));
                            pp.addAll(p);
                            partitions.add(pp);
                        }
                    }
                }
            }
            preRes.put(i, partitions);
        }

        return preRes.get(0);
    }

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
}
