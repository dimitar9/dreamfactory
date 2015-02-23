package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/palindrome-partitioning/">Palindrome Partitioning</a>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 * <p>
 * <pre>
 * For example, given s = "aab",
 * Return
 *
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 * </pre>
 */
public interface PalindromePartitioning {
    List<List<String>> partition(String s);
}
