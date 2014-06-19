package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://leetcode.com/onlinejudge#question_85">Q085 Maximal Rectangle</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return
 * its area.
 * <p/>
 * http://stackoverflow.com/questions/1726632/dynamic-programming-largest-square-block
 *
 * @see <a href="http://discuss.leetcode.com/questions/260/maximal-rectangle">Leetcode discussion</a>
 * @see <a href="http://hi.baidu.com/mzry1992/item/030f9740e0475ef7dc0f6cba">浅谈用极大化思想解决最大子矩形问题</a>
 * @see <a href="http://www.drdobbs.com/article/print?articleId=184410529&siteSectionName=database">From Dr.Dobbs</a>
 */
public interface Q085MaximalRectangle {
    int maximalRectangle(char[][] matrix);
}
