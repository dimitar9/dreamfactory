package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/4sum/">4Sum</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all
 * unique quadruplets in the array which gives the sum of target.
 * <p/>
 * Note:
 * <p/>
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ? b ? c ? d)
 * The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * <p/>
 * A solution set is:
 * (-1,  0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2,  0, 0, 2)
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/199/4sum">Leetcode discussion</a>
 */
public interface FourSum {
    ArrayList<ArrayList<Integer>> fourSum(int[] num, int target);
}
