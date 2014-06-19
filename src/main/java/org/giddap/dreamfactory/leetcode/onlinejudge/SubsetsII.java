package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/subsets-ii/">Subsets II</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * <p/>
 * <p/>
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 * <p/>
 * Note:
 * <p/>
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * <pre>
 * For example,
 * If S = [1,2,2], a solution is:
 *
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/265/subsets-ii">Leetcode discussion</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32171823.html">Mitbbs discussion</a>
 */
public interface SubsetsII {
    ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num);
}
