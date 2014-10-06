package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/sort-colors/">Sort Colors</a>
 * Copyright 2013 LeetCode
 * <p/>
 * Given an array with n objects colored red, white or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white and blue.
 * <p/>
 * Here, we will use the integers 0, 1, and 2 to represent the color red,
 * white, and blue respectively.
 * <p/>
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 * <p/>
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting
 * sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then
 * overwrite array with total number of 0's, then 1's and followed by 2's.
 * <p/>
 * Could you come up with an one-pass algorithm using only constant space?
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/251/sort-colors">Leetcode discussion</a>
 * @see <a href="http://blog.csdn.net/zxzxy1988/article/details/8596144">zxzxy1988's blog</a>
 * @see <a href="http://en.wikipedia.org/wiki/Dutch_national_flag_problem">Dutch national flag problem on Wikipedia</a>
 * @see <a href="http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Flag/">lloyd's page</a>
 */
public interface SortColors {
    void sortColors(int[] A);
}
