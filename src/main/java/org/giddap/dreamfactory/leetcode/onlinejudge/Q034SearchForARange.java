package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/search-for-a-range/
 * <p/>
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * <p/>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p/>
 * If the target is not found in the array, return [-1, -1].
 * <p/>
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * <p/>
 * Good article:
 * http://community.topcoder.com/tc?module=Static&d1=tutorials&d2=binarySearch
 * http://discuss.leetcode.com/questions/213/search-for-a-range
 * http://www.tbray.org/ongoing/When/200x/2003/03/22/Binary
 */
public interface Q034SearchForARange {
    int[] searchRange(int[] A, int target);
}
