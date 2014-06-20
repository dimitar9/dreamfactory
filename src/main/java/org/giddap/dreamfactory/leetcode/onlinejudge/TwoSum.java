package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="https://oj.leetcode.com/problems/two-sum/">Two Sum</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
 * are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * <pre>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/188/two-sum">Leetcode discussion</a>
 */
public interface TwoSum {
    int[] twoSum(int[] numbers, int target);
}
