package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/largest-rectangle-in-histogram/
 * <p/>
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find
 * the area of largest rectangle in the histogram.
 * <p/>
 * <p/>
 * <p/>
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * <p/>
 * <p/>
 * <p/>
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <p/>
 * For example,
 * Given height = [2,1,5,6,2,3],
 * return 10.
 * <p/>
 * Links:
 * http://www.mitbbs.com/article_t1/JobHunting/32268417_0_1.html
 * http://discuss.leetcode.com/questions/259/largest-rectangle-in-histogram
 * http://www.informatik.uni-ulm.de/acm/Locals/2003/html/judge.html
 */
public interface LargestRectangleInHistogram {
    int largestRectangleArea(int[] height);
}
