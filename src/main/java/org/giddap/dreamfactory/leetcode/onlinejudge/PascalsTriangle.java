package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/pascals-triangle/">Pascal's Triangle</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p/>
 * For example, given numRows = 5,
 * Return
 * <p/>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/283/pascals-triangle">Leetcode discussion</a>
 */
public interface PascalsTriangle {
    List<List<Integer>> generate(int numRows);
}
