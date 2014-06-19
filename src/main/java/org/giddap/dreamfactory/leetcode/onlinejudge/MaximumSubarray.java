package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/maximum-subarray/">Maximum Subarray</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p/>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * <p/>
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/231/maximum-subarray">leetcode discussion</a>
 */
public interface MaximumSubarray {
    int maxSubArray(int[] A);
}
