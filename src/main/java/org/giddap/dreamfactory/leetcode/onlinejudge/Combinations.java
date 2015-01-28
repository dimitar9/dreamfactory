package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/combinations/">Combinations</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given two integers n and k, return all possible combinations of k numbers
 * out of 1 ... n.
 * <p/>
 * <pre>
 * For example,
 * If n = 4 and k = 2, a solution is:
 *
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/252/combinations">leetcode discussion</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32147785.html">mitbbs discussion</a>
 */
public interface Combinations {
    List<List<Integer>> combine(int n, int k);
}
