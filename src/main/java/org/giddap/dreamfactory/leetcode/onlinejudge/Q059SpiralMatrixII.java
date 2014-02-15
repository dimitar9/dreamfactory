package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/spiral-matrix-ii/
 * <p/>
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p/>
 * <pre>
 * For example,
 * Given n = 3,
 *
 * You should return the following matrix:
 * [
 *   [ 1, 2, 3 ],
 *   [ 8, 9, 4 ],
 *   [ 7, 6, 5 ]
 * ]
 * </pre>
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/236/spiral-matrix-ii
 */
public interface Q059SpiralMatrixII {
    int[][] generateMatrix(int n);
}
