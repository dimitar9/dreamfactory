package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.EditDistance;

public class EditDistanceBottomUpDpImpl implements EditDistance {
    @Override
    public int minDistance(String word1, String word2) {

        if (word1.equals(word2)) {
            return 0;
        }

        final int len1 = word1.length();
        final int len2 = word2.length();

        if (len1 == 0) {
            return len2;
        }

        if (len2 == 0) {
            return len1;
        }

        // create two work vectors of integer distances
        int[] prevRow = new int[len1 + 1];
        int[] currRow = new int[len1 + 1];

        // initialize v0 (the previous row of distances)
        // this row is A[0][i]: edit distance for an empty s
        // the distance is just the number of characters to delete from t
        for (int i = 0; i < prevRow.length; i++) {
            prevRow[i] = i;
        }

        for (int i = 0; i < len2; i++) {
            // calculate v1 (current row distances) from the previous row v0

            // first element of v1 is A[i+1][0]
            //   edit distance is delete (i+1) chars from s to match empty t
            currRow[0] = i + 1;

            // use formula to fill in the rest of the row
            for (int j = 0; j < len1; j++) {
                int cost = (word1.charAt(j) == word2.charAt(i)) ? 0 : 1;
                currRow[j + 1] = Math.min(prevRow[j] + cost, prevRow[j + 1] + 1);
                currRow[j + 1] = Math.min(currRow[j + 1], currRow[j] + 1);
            }

            // copy v1 (current row) to v0 (previous row) for next iteration
            for (int j = 0; j < currRow.length; j++) {
                prevRow[j] = currRow[j];
            }
        }

        return currRow[currRow.length - 1];
    }
}
