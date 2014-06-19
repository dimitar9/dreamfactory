package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/set-matrix-zeroes/">Set Matrix Zeroes</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a m x n matrix, if an element is 0, set its entire row and column
 * to 0. Do it in place.
 * <p/>
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/249/set-matrix-zeroes">Leetcode discussion</a>
 */
public interface Q073SetMatrixZeroes {
    void setZeroes(int[][] matrix);
}
