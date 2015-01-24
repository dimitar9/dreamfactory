package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.EditDistance;

import java.util.Arrays;

public class EditDistanceBottomUpDpImpl implements EditDistance {
    @Override
    public int minDistance(String word1, String word2) {
        final int n1 = word1.length();
        final int n2 = word2.length();
        if (n1 == 0 || n2 == 0) {
            return Math.max(n1, n2);
        }
        int[] prev = new int[n1 + 1];
        int[] curr = new int[n1 + 1];

        for (int i = 0; i < prev.length; i++) {
            prev[i] = i;
        }

        for (int i = 0; i < n2; i++) {
            curr[0] = prev[0] + 1;
            char c2 = word2.charAt(i);
            for (int j = 0; j < n1; j++) {
                char c1 = word1.charAt(j);
                curr[j + 1] = Math.min(prev[j + 1], curr[j]) + 1;
                curr[j + 1] = Math.min(
                        curr[j + 1], prev[j] + (c1 == c2 ? 0 : 1));
            }
            prev = Arrays.copyOf(curr, curr.length);
        }
        return prev[prev.length - 1];
    }
}
