package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/search-a-2d-matrix/">Search a 2D Matrix</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * <p/>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the
 * previous row.
 * <pre>
 * For example,
 *
 * Consider the following matrix:
 *
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * </pre>
 * <p/>
 * Comments:
 * Row-major order.
 * <p/>
 * Links:
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/250/search-a-2d-matrix">leetcode discussion</a>
 */
public interface Q074Search2dMatrix {
    boolean searchMatrix(int[][] matrix, int target);
}
