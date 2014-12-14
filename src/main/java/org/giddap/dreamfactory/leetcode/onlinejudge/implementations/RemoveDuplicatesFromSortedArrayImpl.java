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
        if (A.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                A[j] = A[i];
                j++;
            }
        }
        return j;
    }
}
