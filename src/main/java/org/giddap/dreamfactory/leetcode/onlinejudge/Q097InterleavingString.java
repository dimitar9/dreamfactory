package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://leetcode.com/onlinejudge#question_97">Q097 Interleaving String</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * <p/>
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * <p/>
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/271/interleaving-string">Leetcode discussion</a>
 * @see <a href="http://www.mitbbs.com/article_t1/JobHunting/32202217_0_1.html">Mitbbs discussion</a>
 */
public interface Q097InterleavingString {
    boolean isInterleave(String s1, String s2, String s3);
}
