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
 * http://n00tc0d3r.blogspot.com/2013/03/interleaving-string-gene-matching.html
 * http://stackoverflow.com/questions/22795589/dynamic-programming-problems-solution-to-interleaving-strings
 * http://stackoverflow.com/questions/6804956/interleaving-of-two-strings
 */
public interface InterleavingString {
    boolean isInterleave(String s1, String s2, String s3);
}
