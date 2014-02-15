package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q045JumpGameII;

/**
 * http://leetcode.com/onlinejudge#question_45
 * <p/>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p/>
 * Each element in the array represents your maximum jump length at that position.
 * <p/>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p/>
 * For example:
 * Given array A = [2,3,1,1,4]
 * <p/>
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3
 * steps to the last index.)
 * <p/>
 * links:
 * http://discuss.leetcode.com/questions/223/jump-game-ii
 * http://www.mitbbs.com/article_t/JobHunting/32123995.html
 */
public class Q045JumpGameIIOnImpl implements Q045JumpGameII {
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
        int ret = 0;
        int last = 0;
        int curr = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > last) {
                if (curr < i) {
                    return -1; // unreachable
                }
                last = curr;
                ++ret;
            }
            curr = Math.max(curr, i + A[i]);
        }

        return ret;
    }
}
