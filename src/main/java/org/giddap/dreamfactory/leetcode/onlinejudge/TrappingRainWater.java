package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/trapping-rain-water/
 * <p/>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p/>
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * <p/>
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain
 * water (blue section) are being trapped.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/220/trapping-rain-water
 * http://fisherlei.blogspot.com/2013/01/leetcode-trapping-rain-water.html
 * http://coding-exercise.blogspot.com/2013/03/leetcode-trapping-rain-water.html
 *
 */
public interface TrappingRainWater {
    int trap(int[] A);
}
