package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/combination-sum-ii/">Combination Sum II</a>
 * <pre>
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 *
 * Each number in C may only be used once in the combination.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 *
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 * A solution set is:
 * [1, 7]
 * [1, 2, 5]
 * [2, 6]
 * [1, 1, 6]
 * </pre>
 * <p/>
 * Good article:
 * http://discuss.leetcode.com/questions/218/combination-sum-ii
 * http://www.cnblogs.com/remlostime/archive/2012/10/29/2745125.html
 * http://blog.csdn.net/u010204902/article/details/8804241
 */
public interface Q040CombinationSumII {
    ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target);
}
