package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/combination-sum/">Combination Sum</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where
 * the candidate numbers sums to T.
 * <p/>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p/>
 * Note:
 * <p/>
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, ai , ak) must be in non-descending order. (ie, a1 <= a2 <= ai <= ak).
 * The solution set must not contain duplicate combinations.
 * <pre>
 * For example, given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 *      [7]
 *      [2, 2, 3]
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/61/combination-sum">leetcode discussion</a>
 * @see <a href="http://leetcode.com/2010/09/print-all-combinations-of-number-as-sum.html">leetcode blog</a>
 */
public interface CombinationSum {
    List<List<Integer>> combinationSum(int[] candidates, int target);
}
