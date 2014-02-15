package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q115DistinctSubsequences;

public class Q115DistinctSubsequencesImpl implements Q115DistinctSubsequences {

    @Override
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] occurence = new int[T.length() + 1];
        occurence[0] = 1;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < T.length(); j++) {
                occurence[j + 1] += (S.charAt(i) == T.charAt(j)) ? occurence[j] : 0;
            }
        }
        return occurence[T.length()];
    }
}
