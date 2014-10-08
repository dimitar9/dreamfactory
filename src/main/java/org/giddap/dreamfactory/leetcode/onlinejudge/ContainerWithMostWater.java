package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/container-with-most-water/
 * <p/>
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i,
 * ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).  Find two lines,
 * which together with x-axis forms a container, such that the container contains the most water.
 * <p/>
 * Links:
 * http://n00tc0d3r.blogspot.com/2013/02/container-with-most-water.html?q=Container+with+most+water
 */
public interface ContainerWithMostWater {
    int maxArea(int[] height);
}
