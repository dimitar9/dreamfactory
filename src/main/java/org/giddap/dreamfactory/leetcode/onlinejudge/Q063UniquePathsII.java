package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://leetcode.com/onlinejudge#question_63
 * <p/>
 * Follow up for "Unique Paths":
 * <p/>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p/>
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <p/>
 * <pre>
 * For example,
 *
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 *
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * </pre>
 * <p/>
 * Note: m and n will be at most 100.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/239/unique-paths-ii">leetcode discussion</a>
 */
public interface Q063UniquePathsII {
    int uniquePathsWithObstacles(int[][] obstacleGrid);
}
