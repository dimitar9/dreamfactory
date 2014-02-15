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
 * <p/>
 * "Disjoint set.  Union find"
 * Links:
 * http://discuss.leetcode.com/questions/1070/longest-consecutive-sequence
 * http://blog.sina.com.cn/s/blog_b9285de20101iqar.html
 * http://en.wikipedia.org/wiki/Disjoint-set_data_structure
 * http://codedojo.konstantin-gurnov.com/job-interview-questions-on-algorithms-prinseton/
 * http://chuansong.me/n/93910
 * http://www.geeksforgeeks.org/union-find-algorithm-set-2-union-by-rank/
 */
public interface Q128LongestConsecutiveSequence {
    int longestConsecutive(int[] num);
}
