package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.JumpGameII;

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
public class JumpGameIIOnImpl implements JumpGameII {
    /**
     * O(n) solution!
     * <p/>
     * We use "last" to keep track of the maximum distance that has been reached
     * by using the minimum steps "ret", whereas "curr" is the maximum distance
     * that can be reached by using "ret+1" steps. Thus,
     * curr = max(i+A[i]) where 0 <= i <= last.
     */
    @Override
    public int jump(int[] A) {
        final int n = A.length;
        if (n == 1) {
            return 0;
        }
        int upper = 0;
        int next = upper;
        int step = 0;
        for (int i = 0; i <= upper; i++) {
            int reach = i + A[i];
            if (reach >= n - 1) {
                return step + 1;
            }
            next = Math.max(next, reach);
            if (i == upper) {
                step++;
                upper = next;
            }
        }
        return step;
    }
}