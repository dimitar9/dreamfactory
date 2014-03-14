package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/subsets/">Subsets</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a set of distinct integers, S, return all possible subsets.
 * <p/>
 * Note:
 * <p/>
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * <pre>
 * For example,
 * If S = [1,2,3], a solution is:
 *
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/253/subsets">Leetcode discussion</a>
 * @see <a href="http://gongxuns.blogspot.ca/2012/12/leetcodesubsets.html">gongxuns blog</a>
 * @see <a href="https://github.com/logicmd/leetcode/blob/master/Subsets.java">lgicmd @ github</a>
 * @see <a href="http://compprog.wordpress.com/2007/10/10/generating-subsets/">compprog blog</a>
 * @see <a href="http://www.stefan-pochmann.info/spots/tutorials/sets_subsets/">Another online tutorial</a>
 */
public interface Subsets {
    ArrayList<ArrayList<Integer>> subsets(int[] S);
}
