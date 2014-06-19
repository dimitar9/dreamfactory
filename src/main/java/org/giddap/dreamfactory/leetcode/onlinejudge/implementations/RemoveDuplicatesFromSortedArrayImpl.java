package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveDuplicatesFromSortedArray;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n)</li>
 * <li>Space complexity: O(1)</li>
 * <li>Use two pointers:
 * <ul>
 * <li>fast: points to the next element.</li>
 * <li>slow: points to the last verified element</li>
 * </ul>
 * </li>
 * <li>
 * <pre>
 *  if (A[j] != A[i]) {
 *      A[++i] = A[j];
 *  }
 * </pre>
 * </li>
 * </ul>
 */

public class RemoveDuplicatesFromSortedArrayImpl implements RemoveDuplicatesFromSortedArray {
    @Override
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (A.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < A.length; j++) {
            if (A[j] != A[i]) {
                A[++i] = A[j];
            }
        }
        return i + 1;
    }
}
