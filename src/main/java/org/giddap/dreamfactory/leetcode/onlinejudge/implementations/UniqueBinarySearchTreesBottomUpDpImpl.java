package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniqueBinarySearchTrees;

/**
 *
 */
public class UniqueBinarySearchTreesBottomUpDpImpl implements UniqueBinarySearchTrees {

    @Override
    public int numTrees(int n) {
        int[] counts = new int[n + 1];
        counts[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                counts[i] += counts[j - 1] * counts[i - j];
            }
        }
        return counts[n];
    }
}
