package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/3sum/">3Sum</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique
 * triplets in the array which gives the sum of zero.
 * <p/>
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ? b ? c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * <p/>
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 * <p/>
 *
 * @see <a href="http://leetcode.com/2010/04/finding-all-unique-triplets-that-sums.html">Leetcode blog</a>
 */
public interface ThreeSum {
    List<List<Integer>> threeSum(int[] num);
}
