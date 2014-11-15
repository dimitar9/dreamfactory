package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.EditDistance;

public class EditDistanceBottomUpDpImpl implements EditDistance {
    @Override
    public int minDistance(String word1, String word2) {
        final int sLen = word1.length();
        final int tLen = word2.length();
        int[] prev = new int[tLen + 1];
        // initialize the array
        for (int i = 0; i <= tLen; i++) {
            prev[i] = i;
        }
        // fill out the table
        for (int r = 0; r < sLen; r++) {
            int[] curr = new int[tLen + 1];
            curr[0] = r + 1;
            for (int c = 1; c <= tLen; c++) {
                curr[c] = Math.min(prev[c], curr[c - 1]) + 1;
                if (word1.charAt(r) == word2.charAt(c - 1)) {
                    curr[c] = Math.min(curr[c], prev[c - 1]);
                } else {
                    curr[c] = Math.min(curr[c], prev[c - 1] + 1);
                }
            }
            prev = curr;
        }
        return prev[tLen];
    }
}
