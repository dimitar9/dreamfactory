package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/distinct-subsequences/">Distinct Subsequences</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * <p/>
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 * <p/>
 * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a
 * subsequence of "ABCDE" while "AEC" is not).
 * <p/>
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 * <p/>
 * Return 3.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/281/distinct-subsequences">Leetcode discussion</a>
 * @see <a href="http://tech-lightnight.blogspot.com/2012/11/distinct-subsequences.html">A recursive solution</a>
 */
public interface Q115DistinctSubsequences {
    int numDistinct(String S, String T);
}
