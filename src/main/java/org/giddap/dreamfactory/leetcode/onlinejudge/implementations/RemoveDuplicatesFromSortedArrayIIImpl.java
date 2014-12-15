package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveDuplicatesFromSortedArrayII;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n)</li>
 * <li>Space complexity: O(1)</li>
 * <li>Use two pointers:
 * <ul>
 * <li>fast: points to the next element.</li>
 * <li>slow: points to the last verified element</li>
 * <li>Extra condition to satisfy 'at most twice'.</li>
 * </ul>
 * </li>
 * <li>Thought Process: Let's start with a simpler case - no duplicate is
 * allowed. We then build up the more complicated case on top of the simpler
 * case.
 * </li>
 * <li>
 * <pre>
 *  if ((A[j] != A[i]) || (i == 0) || (A[i] != A[i - 1])) {
 *      A[++i] = A[j];
 *  }
 * </pre>
 * </li>
 * </ul>
 */
public class RemoveDuplicatesFromSortedArrayIIImpl implements RemoveDuplicatesFromSortedArrayII {

    @Override
    public int removeDuplicates(int[] A) {
        final int len = A.length;
        if (len <= 2) {
            return len;
        }
        int i = 2;
        for (int j = 2; j < len; j++) {
            if (A[j] != A[i - 1] || A[j] != A[i - 2]) {
                A[i] = A[j];
                i++;
            }
        }
        return i;
    }
}
