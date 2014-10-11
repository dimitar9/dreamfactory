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
 * http://n00tc0d3r.blogspot.com/2013/05/palindrome-partitioning.html
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101jbtl.html">peking2's blog</a>
 */
public interface PalindromePartitioning {
    ArrayList<ArrayList<String>> partition(String s);
}
