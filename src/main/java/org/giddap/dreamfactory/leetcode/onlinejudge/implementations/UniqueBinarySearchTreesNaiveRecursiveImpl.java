package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniqueBinarySearchTrees;

/**
 *
 */
public class UniqueBinarySearchTreesNaiveRecursiveImpl implements UniqueBinarySearchTrees {

    @Override
    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += numTrees(i - 1) * numTrees(n - i);
        }

        return count;
    }
}
