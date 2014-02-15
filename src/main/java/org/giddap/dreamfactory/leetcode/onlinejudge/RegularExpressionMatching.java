package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/regular-expression-matching/
 * <p/>
 * Implement regular expression matching with support for '.' and '*'.
 * <p/>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p/>
 * The matching should cover the entire input string (not partial).
 * <p/>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p/>
 * Some examples:
 * isMatch("aa","a") ? false
 * isMatch("aa","aa") ? true
 * isMatch("aaa","aa") ? false
 * isMatch("aa", "a*") ? true
 * isMatch("aa", ".*") ? true
 * isMatch("ab", ".*") ? true
 * isMatch("aab", "c*a*b") ? true
 * <p/>
 * Links:
 * http://leetcode.com/2011/09/regular-expression-matching.html
 */
public interface RegularExpressionMatching {
    boolean isMatch(String s, String p);
}
