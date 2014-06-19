package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/palindrome-partitioning/">Palindrome Partitioning</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p/>
 * Return all possible palindrome partitioning of s.
 * <p/>
 * <pre>
 * For example, given s = "aab",
 * Return
 *
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/1265/palindrome-partitioning">leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101jbtl.html">peking2's blog</a>
 */
public interface Q131PalindromePartitioning {
    ArrayList<ArrayList<String>> partition(String s);
}
