package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * http://oj.leetcode.com/problems/spiral-matrix/
 * <p/>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p/>
 * For example,
 * Given the following matrix:
 * <p/>
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/29/spiral-matrix
 * http://blog.unieagle.net/2012/10/23/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Aspiral-matrix/
 * http://yucoding.blogspot.com/2013/04/leetcode-question-100-spiral-matrix-i.html
 */
public interface Q054SpiralMatrix {
    ArrayList<Integer> spiralOrder(int[][] matrix);
}
