package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleImpl implements Triangle {
    @Override
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
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
