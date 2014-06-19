package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/wildcard-matching/">Wildcard
 * Matching</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Implement wildcard pattern matching with support for '?' and '*'.
 * <p/>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p/>
 * The matching should cover the entire input string (not partial).
 * <p/>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p/>
 * <pre>
 * Some examples:
 * isMatch("aa","a") ? false
 * isMatch("aa","aa") ? true
 * isMatch("aaa","aa") ? false
 * isMatch("aa", "*") ? true
 * isMatch("aa", "a*") ? true
 * isMatch("ab", "?*") ? true
 * isMatch("aab", "c*a*b") ? false
 * </pre>
 * <p/>
 * Good article:
 * http://discuss.leetcode.com/questions/222/wildcard-matching
 * http://n00tc0d3r.blogspot.com/2013/05/regular-expression-matching.html
 * http://blog.sina.com.cn/s/blog_b9285de20101gw2x.html
 */
public interface WildcardMatching {
    boolean isMatch(String s, String p);
}
