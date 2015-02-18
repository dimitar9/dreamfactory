package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/longest-consecutive-sequence/
 * <p/>
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p/>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p/>
 * Your algorithm should run in O(n) complexity.
 */
public interface LongestConsecutiveSequence {
    int longestConsecutive(int[] num);
}
