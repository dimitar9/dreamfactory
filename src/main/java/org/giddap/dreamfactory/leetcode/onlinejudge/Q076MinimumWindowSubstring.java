package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/minimum-window-substring/">Minimum Window Substring</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a string S and a string T, find the minimum window in S which will
 * contain all the characters in T in complexity O(n).
 * <p/>
 * For example,
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * <p/>
 * Minimum window is "BANC".
 * <p/>
 * Note:
 * If there is no such window in S that covers all characters in T, return the
 * emtpy string "".
 * <p/>
 * If there are multiple such windows, you are guaranteed that there will
 * always be only one unique minimum window in S.
 * <p/>
 *
 * @see <a href="http://leetcode.com/2010/11/finding-minimum-window-in-s-which.html">Leetcode blog</a>
 */
public interface Q076MinimumWindowSubstring {
    String minWindow(String S, String T);
}
