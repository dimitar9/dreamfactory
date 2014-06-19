package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/search-in-rotated-sorted-array/
 * <p/>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p/>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p/>
 * You may assume no duplicate exists in the array.
 * <p/>
 * Good article:
 * <p/>
 * http://discuss.leetcode.com/questions/17/search-in-rotated-sorted-array
 */
public interface Q033SearchInRotatedSortedArray {
    int search(int[] A, int target);
}
