package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/palindrome-partitioning-ii/">Palindrome Partitioning II</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p/>
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * <p/>
 * <pre>
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/1266/palindrome-partitioning-ii">leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101iwqt.html">peking2's blog</a>
 * @see <a href="http://blog.163.com/guixl_001/blog/static/417641042013319113320284/">guixl's blog</a>
 */
public interface Q132PalindromePartitioningII {
    int minCut(String s);
}
