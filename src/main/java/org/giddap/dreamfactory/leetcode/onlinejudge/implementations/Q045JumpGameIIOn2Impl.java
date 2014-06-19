package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q045JumpGameII;

/**
 *
 */
public class Q045JumpGameIIOn2Impl implements Q045JumpGameII {
    /**
     * O(n) solution!
     * <p/>
     * We use "last" to keep track of the maximum distance that has been reached
     * by using the minimum steps "ret", whereas "curr" is the maximum distance
     * that can be reached by using "ret+1" steps. Thus,
     * curr = max(i+A[i]) where 0 <= i <= last.
     */
    @Override
    public int jump2(int[] A) {
        int start = 0;
        int end = A[0];
        int maxEnd = A[0];

        int numOfJumps = 0;
        while (start < A.length) {

            for (int i = start; i <= end; i++) {
                maxEnd = Math.max(maxEnd, A[i] + i);
                if (maxEnd >= A.length - 1) {
                    break;
                }
            }
            start = end + 1;
            end = maxEnd;
            numOfJumps++;
        }
        return numOfJumps;
    }
}
