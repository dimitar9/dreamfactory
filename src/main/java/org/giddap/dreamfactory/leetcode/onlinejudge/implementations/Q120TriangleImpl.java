package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q120Triangle;

import java.util.ArrayList;

public class Q120TriangleImpl implements Q120Triangle {
    @Override
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int numOfRows = triangle.size();
        if (numOfRows == 0) {
            return 0;
        }

        int[] previousRowSums = new int[numOfRows + 1];

        for (int i = numOfRows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                previousRowSums[j] = triangle.get(i).get(j)
                        + Math.min(previousRowSums[j], previousRowSums[j + 1]);
            }
        }

        return previousRowSums[0];
    }
}
