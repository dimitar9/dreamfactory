package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/triangle/">Triangle</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on
 * the row below.
 * <p/>
 * <pre>
 * For example, given the following triangle
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * </pre>
 * <p/>
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the
 * triangle.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/285/triangle">Leetcode discussion</a>
 */
public interface Q120Triangle {
    int minimumTotal(ArrayList<ArrayList<Integer>> triangle);
}
