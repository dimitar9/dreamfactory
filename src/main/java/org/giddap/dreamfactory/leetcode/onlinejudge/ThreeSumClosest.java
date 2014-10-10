package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/3sum-closest/">3Sum Closest</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * <p/>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p/>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * @see <a href="http://discuss.leetcode.com/questions/197/3sum-closest">Leetcode discussion</a>
 */
public interface ThreeSumClosest {
    int threeSumClosest(int[] num, int target);
}
