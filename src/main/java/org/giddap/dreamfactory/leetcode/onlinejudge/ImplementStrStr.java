package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/implement-strstr/">Implement strStr()</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Implement strStr().
 * <p/>
 * Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of haystack.
 * <p/>
 *
 * @see <a href="http://leetcode.com/2010/10/implement-strstr-to-find-substring-in.html">Leetcode blog</a>
 * KMP: http://blog.csdn.net/v_july_v/article/details/7041827
 * KMP: http://blog.csdn.net/yaochunnian/article/details/7059486
 * KMP: http://billhoo.blog.51cto.com/2337751/411486/
 */
public interface ImplementStrStr {
    int strStr(String haystack, String needle);
}
