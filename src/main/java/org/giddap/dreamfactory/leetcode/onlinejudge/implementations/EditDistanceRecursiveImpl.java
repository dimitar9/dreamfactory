package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.EditDistance;

public class EditDistanceRecursiveImpl implements EditDistance {
    @Override
    public int minDistance(String word1, String word2) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        return calc(word1, word2, 0);
    }

    private int calc(String suffix1, String suffix2, int distance) {
        final int len1 = suffix1.length();
        final int len2 = suffix2.length();

        if (len1 == 0 && len2 == 0) {
            return distance;
        }

        if (len1 == 0) {
            return distance + len2;
        }

        if (len2 == 0) {
            return distance + len1;
        }

        int nextDistance = 0;
        if (suffix1.charAt(0) == suffix2.charAt(0)) {
            nextDistance = calc(suffix1.substring(1), suffix2.substring(1), distance);
        } else {
            nextDistance = calc(suffix1.substring(1), suffix2.substring(1), distance + 1);
        }

        nextDistance = Math.min(nextDistance, calc(suffix1.substring(1), suffix2, distance + 1));
        nextDistance = Math.min(nextDistance, calc(suffix1, suffix2.substring(1), distance + 1));

        return nextDistance;
    }
}
